package com.infiniteskills.spring.Controller.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.infiniteskills.spring.Controller.data.entities.Resource;
import com.infiniteskills.spring.Controller.data.services.ResourceService;

@Controller
@RequestMapping("/resource")
@SessionAttributes("resource")
public class ResourceController {

	@Autowired 
	private ResourceService resourceService;
	void initList(Model model)
	{

		List<String>radios=new LinkedList<>();
		radios.add("Hours");
		radios.add("Tons");
		radios.add("Pieces");
		model.addAttribute("radioOptions",radios);
		
		
		List<String>checks=new LinkedList<>(Arrays.asList(new String[] {"Lead Time ","Special Rate ","Requires Approval"}));
		model.addAttribute("checkOptions",checks);
				
	}
	
	@RequestMapping("/find")
	public String find(Model model)
	{
		model.addAttribute("resources", this.resourceService.findAll());
		return "resource";
	}
	
	@RequestMapping("/add")
	public String add(Model model)
	{
		
		List<String>options=new LinkedList<>(Arrays.asList(new String[] {"Material","Other","Staff","Technical Equipment"}));
		model.addAttribute("typeOptions",options);
		initList(model);
		model.addAttribute("resource",new Resource());
		return "resource_add";
	}
	
	@RequestMapping("/request")
	@ResponseBody
	public String request(@ModelAttribute("resource") Resource resource)
	{
		return "The request has been sent to approval";
	}
	
	@RequestMapping("/review")
	public String review(@ModelAttribute Resource resource)
	{
		System.out.println("Invoking Review");
		return "resource_review";
	}
	
	
	@RequestMapping("/save")
	public String save(@ModelAttribute Resource resource,SessionStatus status)
	{
		//initList(model);
		System.out.println(resource);
		status.setComplete();
		this.resourceService.save(resource);
		return "redirect:/resource/add";
	}
}
