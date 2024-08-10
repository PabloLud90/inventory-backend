package com.company.inventory_System.response;

import java.util.List;

import com.company.inventory_System.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;
	

}
