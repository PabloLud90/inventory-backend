package com.company.inventory_System.response;

import java.util.List;

import com.company.inventory_System.model.Category;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CategoryResponseRest extends ResponseRest{
	
	private CategoryResponse categoryResponse = new CategoryResponse();

	public void setCategory(List<Category> category) {
		// TODO Auto-generated method stub
		
	} 
	

}
