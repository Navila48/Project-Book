package com.infiniteskills.spring.Controller.data.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.infiniteskills.spring.Controller.data.entities.Project;

public class ProjectServices {

	LinkedList<Project>projects=new LinkedList<>();
	public ProjectServices()
	{
		Project javaProject=this.createProject("Java Project","This is a simple java project");
		Project javaScriptProject=this.createProject("Java Script Project","This is a simple java script project");
		Project htmlProject=this.createProject("Html Project","This is a simple html project");
        projects.addAll(Arrays.asList(new Project[] {javaProject,javaScriptProject,htmlProject})); 	
	}
	public List<Project>findAll ()
	{
		return projects;
	}
	private Project createProject(String name, String description) {
		// TODO Auto-generated method stub
		Project project=new Project();
		project.setName(name);
		project.setAuthorizedFunds(new BigDecimal("10000"));
		project.setAuthorizedHours(new BigDecimal("100"));
		//project.setSponsors("nasa");
		project.setDescription(description);
		return project;
	}
	
	public Project find(Long projectId)
	{
		for(Project p:projects)
		{
			if(p.getProjectId()==(projectId))
				return p;
		}
		return projects.peekFirst();
		
	}
	
	public void save(Project project)
	{
		this.projects.add(project);
		
	}
}
