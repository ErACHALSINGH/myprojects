package com.arit;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
	@RequestMapping("/fetchData")
	    public ModelAndView showUserDetails1(HttpServletRequest request, HttpServletResponse response) throws IOException 
	    {  
	
			
			
	        response.setContentType("text/html");
	        int a1= Integer.parseInt(request.getParameter("n1"));
	        int a2= Integer.parseInt(request.getParameter("n2"));
	        String op= request.getParameter("r");
	        int sol;
	       
	        if(op.equals("add"))
	        {
	           sol=(a1+a2);
	        }
	        else if(op.equals("sub"))
	        {
	        	sol=(a1-a2);
	        }
	        else if(op.equals("mul"))
	        {
	        	sol=(a1*a2);
	        }
	        else
	        {
	        	sol=(a1/a2);
	        }
	        
	        ModelAndView mv1 = new ModelAndView();
			mv1.setViewName("arithresult");
			mv1.addObject("a1",a1);
			mv1.addObject("a2",a2);
			mv1.addObject("sol",sol);
			
			return mv1;
	 

	   }
	
	
	@RequestMapping("/fetchID")
	public ModelAndView showUserDetails(HttpServletRequest request,HttpServletResponse response)
	{
		String uid,uname;
		
		uid=request.getParameter("UserID");
		uname=request.getParameter("UserName");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewresult");
		mv.addObject("uid",uid);
		mv.addObject("un",uname);
		return mv;
	}
	
	}


