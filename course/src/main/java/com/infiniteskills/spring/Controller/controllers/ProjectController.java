package com.infiniteskills.spring.Controller.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infiniteskills.spring.Controller.data.entities.Project;
import com.infiniteskills.spring.Controller.data.services.ProjectServices;
import com.infiniteskills.spring.Controller.data.validators.ProjectValidator;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectServices projectServices;
	
	@RequestMapping("/find")
	public String find(Model model)
	{
		model.addAttribute("projects",this.projectServices.findAll());
		return "project";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addProject(Model model)
	{
		model.addAttribute("typeOptions",new ArrayList<String>() {
			{
				add(" ");
				add("Single Year");
				add("Multi Year");
			}
		});
		model.addAttribute("project",new Project());
		System.out.println("add method is invoking");			
		return "project_add";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String handleError(HttpServletRequest request)
	{
		return "controller_error";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveProject(@Valid @ModelAttribute Project project,RedirectAttributes attributes)
	{
		System.out.println("Save method");
		project.setProjectId(55L);
		this.projectServices.save(project);
		attributes.addFlashAttribute("project",project);
		return "redirect:/";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setValidator(new ProjectValidator());
	}
	
}
