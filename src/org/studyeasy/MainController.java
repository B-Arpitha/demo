package org.studyeasy;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController{
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome()
	{
		return "hello";
	}
	
//	@RequestMapping(value = "dispname")
	@GetMapping(value = "dispname")   // this lets us know it is used for get operation
	public ModelAndView dispName(@RequestParam("firstName") String firstName)
	{
		ModelAndView model = new ModelAndView("displayName");
		Date date = new Date();
		List<String> names = new ArrayList<>();
		names.add("Arp");
		names.add("bru");
		names.add("Bhu");
		
		
		model.addObject("date", date);
		model.addObject("firstName", firstName);
		model.addObject("team",names);
		return model;
	}
}
