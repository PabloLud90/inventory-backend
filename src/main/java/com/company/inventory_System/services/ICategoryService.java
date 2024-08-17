package com.company.inventory_System.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory_System.model.Category;
import com.company.inventory_System.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> saveCategory(Category category);
	public ResponseEntity<CategoryResponseRest> updateCategory(Category category, Long id);	

}
