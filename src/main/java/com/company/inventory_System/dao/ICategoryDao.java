package com.company.inventory_System.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.inventory_System.model.Category;

public interface ICategoryDao  extends CrudRepository<Category, Long>{
	
	
}
