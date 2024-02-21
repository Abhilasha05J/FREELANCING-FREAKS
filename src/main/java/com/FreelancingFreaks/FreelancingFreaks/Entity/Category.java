package com.FreelancingFreaks.FreelancingFreaks.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id")
	private long category_id;
	
	@Column(name="cat_name")
	private String cat_name;
	
	@Column(name="cat_status")
	private boolean cat_status;

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public boolean getCat_status() {
		return cat_status;
	}

	public void setCat_status(boolean cat_status) {
		this.cat_status = cat_status;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(long category_id, String cat_name, boolean cat_status) {
		super();
		this.category_id = category_id;
		this.cat_name = cat_name;
		this.cat_status = cat_status;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", cat_name=" + cat_name + ", cat_status=" + cat_status + "]";
	}
	
	
	
	
	

}
