package com.infiniteskills.spring.Controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infiniteskills.spring.Controller.data.entities.Project;

@Controller
public class HomeController {

	
	@RequestMapping(value="/")	
	public String goHome(Model model,@ModelAttribute("project") Project project)
	{
		//Project project=new Project();
		//project.setName("Air Project");
		//project.setSponsors("NASA");
		//project.setDescription("This is a simple nasa project");
		model.addAttribute("currentProject",project);
		return "home";
	}
/*	@RequestMapping("/")
	public String home()
	{
		return "home";
	}*/
}
