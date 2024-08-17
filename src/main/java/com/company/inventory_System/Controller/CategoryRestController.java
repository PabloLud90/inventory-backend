package com.company.inventory_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.inventory_System.model.Category;
import com.company.inventory_System.response.CategoryResponseRest;
import com.company.inventory_System.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {
	
	@Autowired
	private ICategoryService service;
	
	
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> searchCategories(){
		ResponseEntity<CategoryResponseRest> response = service.search();
		return response;
	}
	
	@GetMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> searchCategoriesById(@PathVariable long id){
		ResponseEntity<CategoryResponseRest> response = service.searchById(id);
		return response;
	}
	
	@PostMapping("/categories")
	public ResponseEntity<CategoryResponseRest> saveCategory(@RequestBody Category category){
		ResponseEntity<CategoryResponseRest> response = service.saveCategory(category);
		return response;
	}
	
	@PutMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> updateCategory(@RequestBody Category category, @PathVariable long id){
		ResponseEntity<CategoryResponseRest> response = service.updateCategory(category, id);
		return response;
	}

}
 