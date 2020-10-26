package com.arit.springrest;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.arit.Registration;
import com.arit.model.Employee;


@RequestMapping("/reservation")
@Controller
@RestController
public class RegistrationController {

	
	//ArrayList<Registration> gr = new ArrayList<Registration>();
	  
	//@Autowired

//	@RequestMapping("/submitForm")
//	
//		Registration g1 = new Registration(username,password,firstname,lastname,age,gender);
//	@GetMapping("/login")
//	public Registration handler(@PathVariable String username,@PathVariable String password) {
//	  gr.add(g1);
//	//gr.add(g2);
//	//gr.add(g3);
//
//		for(Registration r: gr) {
//			if(r.getUsername() == username && r.getPassword()==password)
//				return r;
//			
//		}
//		return null;
//	}
	
}
