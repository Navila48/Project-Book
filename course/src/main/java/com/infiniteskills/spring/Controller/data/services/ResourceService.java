package com.infiniteskills.spring.Controller.data.services;

import java.util.LinkedList;
import java.util.List;

import com.infiniteskills.spring.Controller.data.entities.Resource;

public class ResourceService {

	LinkedList<Resource>resources=new LinkedList<>();
	public void save(Resource resource)
	{
		resources.add(resource);
	}
	public List<Resource> findAll()
	{
		return resources;
	}
}
