package com.arit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/fetchData")
	public ModelAndView showUserDetails(
		@RequestParam("UserId") String uid, 
		@RequestParam("UserName") String uname,
		@RequestParam("UserAge") String uage) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("viewUserDetails");
			mv.addObject("uid", uid);
			mv.addObject("un", uname);
			mv.addObject("uag", uage);
			return mv;
	}
}
