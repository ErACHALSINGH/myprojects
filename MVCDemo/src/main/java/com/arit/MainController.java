package com.arit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController 
{
	@RequestMapping("/fetchData")
	public ModelAndView showUserDetails(HttpServletRequest request,HttpServletResponse response)
	{
		String uid,uname = null;
		uid=request.getParameter("UserID");
		uname=request.getParameter("UserName");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewUserDetails");
		mv.addObject("uid",uid);
		mv.addObject("un",uname);
		return mv;
	}
}
