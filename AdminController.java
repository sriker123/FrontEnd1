package com.niit.slt1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppincart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;


//this admin controller is created top control over the links that are in AdminHome 
@Controller
public class AdminController {

	//define 3 methods 
	@Autowired
	CategoryDAO categoryDAO;
	
	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Autowired
	Category category;
	
	
	@RequestMapping("/manage_categories")
	public ModelAndView manageCategories()
	{
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		
		mv.addObject("isUserClickedCategory", "true");

		//get the categories from the database.
		List<Category> categoryList = categoryDAO.getCallCategory();
		mv.addObject("categoryList", categoryList);
		mv.addObject("category", category);//to access domain object
		
		return mv;
	}
	
	@RequestMapping("/manage_products")
	public ModelAndView manageProducts()
	{
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		
		mv.addObject("isUserClickedProducts", "true");

		//get the categories from the database.
		
		return mv;
	}
	
	@RequestMapping("/manage_suppliers")
	public ModelAndView manageSuppliers()
	{
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		
		mv.addObject("isUserClickedSuppliers", "true");

		//get the categories from the database.
		
		return mv;
	}
}
