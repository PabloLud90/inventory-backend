package com.company.inventory_System.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory_System.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();

}
