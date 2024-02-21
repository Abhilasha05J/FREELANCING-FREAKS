package com.FreelancingFreaks.FreelancingFreaks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FreelancingFreaks.FreelancingFreaks.Entity.Category;
import com.FreelancingFreaks.FreelancingFreaks.repository.CategoryRepo;
@Service
public class CategoryServiceImp implements CategoryService{

	@Autowired
	  private CategoryRepo CategoryRepoobj;
	@Override
	public Category addCategory(Category category) {
		return CategoryRepoobj.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category deleteCategory(long CategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategory() {
		return CategoryRepoobj.findAll();
	}

}
