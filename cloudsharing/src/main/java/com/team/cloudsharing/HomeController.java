package com.team.cloudsharing;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.team.cloudsharing.dao.UserDAO;
import com.team.cloudsharing.model.User;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

	    User user = new User("vantien.sn92@gmail.com","Van Tien","123456");
	    userDAO.insert(user);
	 
	    User user1 = userDAO.findByUserId(1);
	    System.out.println(user1);
	    return user1.toString();
	}

	/*@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		System.out.println(locale);
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String login(@Validated User user, Model model) {
		model.addAttribute("userName", user.getUserName());
		return "user";
	}*/
}
