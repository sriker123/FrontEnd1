package com.niit.slt1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppincart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

@Controller
public class CategoryController {
	// Category.jsp - addcategory, delete category, show categorylist, update
	// categorylist, edit category list

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private Category category;
	@RequestMapping("/manage_category_create")
	public ModelAndView createCategory(@RequestParam("Cat_Id") String id, @RequestParam("Cat_Name") String name,

			@RequestParam("Cat_Description") String Description)
	{
		category.setCat_Id(id);
		category.setCat_Name(name);
		category.setCat_Description(Description);

		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		if (categoryDAO.save(category))// check out this line 
			{
			mv.addObject("message", "Successfull category deleted");
	}
	else
	{
	mv.addObject("message", "Add correct credentials");
	}
	return mv;
}

	
/*	 @RequestMapping(value = "/manage_category_create", method =
	 RequestMethod.POST) public ModelAndView
	 createCategory(@ModelAttribute("cat") Category category) {
	 categoryDAO.save(category);
	 ModelAndView mv = new ModelAndView("/Admin/AdminHome");
	 return mv;
	 }
	 
*/
	 @GetMapping("/manage_category_delete/{id}")
		public ModelAndView deleteCategory(@PathVariable("id") String id)
		{
			ModelAndView mv = new ModelAndView("/Admin/AdminHome");
			
			if(categoryDAO.delete(id))
			{
				mv.addObject("message", "Successfully delete the category");
			}
			else
			{
				mv.addObject("message", "Note able delete the category pl contact administrator");
			}
			return mv;
		}

}
