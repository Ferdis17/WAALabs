package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.domain.User;
import edu.mum.service.IUserService;


@Controller
@SessionAttributes(value="user", types = {User.class})
public class AuthenticationController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String logIn() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logInControl(User user, Model model) {
		User logedIn = userService.findByName(user.getName());
		if (logedIn == null || !user.getPassword().equals(logedIn.getPassword()))
			return "login";
		model.addAttribute("user",user);
		
		return "LoginSuccessful";

	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)	
	public String logout(User user, SessionStatus status){
		
		status.setComplete();
		
		return "redirect:/login";
	}
	

}
