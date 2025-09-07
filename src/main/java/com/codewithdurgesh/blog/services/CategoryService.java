package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	 CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//Delete
	 public void  deleteCategory(Integer categoryDto);
	
	
	//get
	
	  CategoryDto getCategory(Integer categoryId);
	
	//get all
	
	List<CategoryDto> getCategories();
	
	
}
