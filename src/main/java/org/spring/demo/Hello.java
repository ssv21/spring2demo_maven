package org.spring.demo;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


public class Hello implements Controller {
	
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res) throws Exception{
		
		String nam  =req.getParameter("name");
		
		Map   map  = new HashMap();
		
		map.put("output","HELLO------->>>>"+nam);
		
		
		ModelAndView   mav = new ModelAndView("success",map);
		
		return mav ;
 		
	}

}
