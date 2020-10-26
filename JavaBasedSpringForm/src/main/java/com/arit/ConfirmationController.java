package com.arit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConfirmationController {
	@RequestMapping("/submitForm")
	public ModelAndView showUserDetails(
		@RequestParam("firstname") String firstname, 
		@RequestParam("lastname") String lastname,
		@RequestParam("gender") String gender,
		@RequestParam("meal") String meal,
		@RequestParam("cityFrom") String cityFrom,
		@RequestParam("cityTo") String cityTo) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("viewUserDetails");
			mv.addObject("firstname", firstname);
			mv.addObject("lastname", lastname);
			mv.addObject("gender", gender);
			mv.addObject("meal", meal);
			mv.addObject("cityFrom", cityFrom);
			mv.addObject("cityTo", cityTo);
			return mv;
	}
}
