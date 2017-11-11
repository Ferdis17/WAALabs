package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.domain.User;
import edu.mum.service.IAdviceService;

@Controller
public class AdviceController {
	
	@Autowired
	private IAdviceService adviceService;
	
	@RequestMapping(value = {"/","/advice"}, method = RequestMethod.GET)
	public String adviceText(Model model) {
		model.addAttribute("roasts",adviceService.getAllRoast());
		//model.addAttribute("user", user);
		return "advice";
	}
	
	@RequestMapping(value ="/advice", method = RequestMethod.POST)
	public String adviceKey(Integer roast, Model model) {
		model.addAttribute("roasts",adviceService.getRoast(roast));
		String result = adviceService.getRoast(roast);
		model.addAttribute("roastList", adviceService.getListByType(result));
		
		
		return "display";
	}
	

}
