package cu.md.controller;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cu.md.domain.Human;
import cu.md.domain.HumanList;
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
	
	@RequestMapping(value="/param1", method= RequestMethod.GET)
	public void param1(@RequestParam String name, @RequestParam int age) {
		log.info("param1() - name: " + name + "age: " + age);
	}
	
	@RequestMapping(value="/param2", method= RequestMethod.GET)
	public void param2(Human dto) {
		log.info("param2() - name: " + dto.getName() + "age: " + dto.getAge());
	}
	
	@RequestMapping(value="/param3", method= RequestMethod.GET)
	public void param3(@RequestParam ArrayList<String> names) {
		log.info("param3() - names: " + names.toString());
	}
	
	@RequestMapping(value="/param4", method= RequestMethod.GET)
	public void param4(@RequestParam("ns") ArrayList<String> names) {
		log.info("param4() - names: " + names.toString());
	}
	
	@RequestMapping(value="/param5", method= RequestMethod.GET)
	public void param5(@RequestParam String[] names) {
		for(String name : names) {
			log.info("param5() - name: " + name);
		}
	}
	
	@RequestMapping(value="/param6", method= RequestMethod.GET)
	public void param6(HumanList list) {
		ArrayList<Human> li = list.getList();
		
		for(Human human : li) {
			log.info("human name: " + human.getName());
			log.info("human age: " + human.getAge());
		}
	}
	
	@GetMapping("json1")
	public ResponseEntity<String> json1() {
		
		String msg = "{\"name\" : \"??????\", \"age\" : 24}";
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json;charset=utf-8");
		
		return new ResponseEntity<String>(msg, headers,HttpStatus.OK);
	}
	
	@GetMapping("json2")
	public @ResponseBody Human json2() {
		
		return new Human("??????", 27);
	}
}