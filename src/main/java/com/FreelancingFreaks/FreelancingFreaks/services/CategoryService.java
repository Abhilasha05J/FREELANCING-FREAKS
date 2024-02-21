package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Category;


public interface CategoryService {
	Category addCategory(Category category);
	Category updateCategory(Category category);
	Category deleteCategory(long CategoryId);
	Category getProductById(long id);
	 List <Category> getAllCategory();
}
