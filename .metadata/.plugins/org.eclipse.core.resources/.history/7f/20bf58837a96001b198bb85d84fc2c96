package cu.ct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("")
	public void m01() {
		log.info("m01()!");
	}
	
	@RequestMapping("/base1")
	public void base1() {
		log.info("base1()! - Get, Post, Put, Delete");
	}
	
	@RequestMapping(value="/base2", method=RequestMethod.GET)
	public void base2() {
		log.info("base2()! - Get");
	}
	
	@RequestMapping(value="/base3", method= {RequestMethod.GET, RequestMethod.POST})
	public void base3() {
		log.info("base3! - Get, Post");
	}
	
	@RequestMapping(value="/form", method= RequestMethod.GET)
	public String form() {
		log.info("form()! - Get");
		
		return "test/form";
	}
}