package com.infiniteskills.spring.Controller.data.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.infiniteskills.spring.Controller.data.entities.Project;

public class ProjectValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		
		return Project.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors error) {
		// TODO Auto-generated method stub

		Project project=(Project) obj;
		if(project.getName().length()<5)
		{
			error.rejectValue("name","project.name","Name is too short");
		}
	}

}
