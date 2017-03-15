package com.niit.slt1.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppincart.dao.CategoryDAO;
import com.niit.shoppincart.dao.ProductDAO;
import com.niit.shoppincart.dao.SupplierDAO;
import com.niit.shoppincart.dao.UserDAO;
import com.niit.shoppingcart.domain.Category;
import com.niit.shoppingcart.domain.Product;
import com.niit.shoppingcart.domain.Supplier;
import com.niit.shoppingcart.domain.User;

@Controller
public class HomeController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private User user;

	/*CategoryDAO categoryDAO;

	@Autowired
	SupplierDAO supplierDAO;

	@Autowired
	ProductDAO productDAO;

	@Autowired
	Product product;

	@Autowired
	Supplier supplier;

	@Autowired
	Category category;*/

	@Autowired
	private HttpSession session;// the session is autowired we can use the
								// session.

	@RequestMapping(value = "/") // MethodHandler
	public ModelAndView showHomePage() {
		System.out.println("this is at home page method");
		ModelAndView mv = new ModelAndView("/home");// Specifying which page we
													// have to navigate
		mv.addObject("msg", "Welcome to Shopping Cart");// What data we have to
														// carry home page
		return mv;
		/*ModelAndView mv=new ModelAndView("/home");
		List<Category> categoryList = categoryDAO.getCallCategory();
		List<Product>  productList = productDAO.getcallProducts();
		List<Supplier> supplierList = supplierDAO.list();

	
		session.setAttribute("categoryList",categoryList);
		session.setAttribute("productList",productList);
		session.setAttribute("supplierList",supplierList);

		session.setAttribute("category", category);
		session.setAttribute("product", product);
		session.setAttribute("supplier", supplier);
		return mv;
*/
	}

	@RequestMapping("/login") // this should have the same name as the jsp file
	public ModelAndView showLoginPage() {
		// System.out.println("Clicked on Login link");
		ModelAndView mv = new ModelAndView("/home");// here it can be any name.
													// same applicable for other
													// Request mapping
		mv.addObject("isUserClickedLogin", "true");
		return mv;
	}

	@RequestMapping("/register")
	public ModelAndView showRegisterPage() {
		// System.out.println("Clicked on registration link");
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("isUserClickedRegister", "true");
		return mv;
	}

	@RequestMapping("/validate")
	// @PostMapping("/"validate")
	public ModelAndView validateCredentials(@RequestParam("userID") String id, @RequestParam("password") String pwd) {
		// Actually we have to get data from DataBase
		// Temporarily UserID-Spike Password -Qwerty@123
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("msg", "welcome to shopping cart");

		if (userDAO.validate(id, pwd) == true) {
			mv.addObject("isUserLoggedIn", "true");
			user = userDAO.getUser(id);
			if (user.getRole().equals("Admin")) {
				mv.addObject("isAdmin", "true");
			} else {
				mv.addObject("isAdmin", "false");
			}
			// mv.addObject("successmsg","Valid Credentials");
			session.setAttribute("loginmessage", "Welcome:  " + id);
		} else {
			mv.addObject("errormsg", "Invalid Credentials....please try again");
		}
		return mv;
	}

	/**
	 * if(id.equals("Spike")&& pwd.equals("Qwerty@123")) {
	 * 
	 * mv.addObject("successmsg","Valid Credentials");
	 * session.setAttribute("loginmessage","Welcome:  "+id); } else {
	 * System.out.println("Wrong Credentials"); mv.addObject("errormsg",
	 * "Invalid Credentials....please try again"); } return mv; }
	 */

	@RequestMapping("/laptop")
	public ModelAndView laptop() {
		System.out.println("this is at laptop page");
		ModelAndView mv = new ModelAndView("/laptop");// Specifying which page
														// we have to navigate
		return mv;
	}

	@RequestMapping("/mobile")
	public ModelAndView mobile() {
		System.out.println("this is at mobile page");
		ModelAndView mv = new ModelAndView("/mobile");// Specifying which page
														// we have to navigate
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView("/home");

		session.removeAttribute("loginmessage");// what ever the values attached
												// to the session are removed

		return mv;
	}

}
