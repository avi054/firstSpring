package com.example.springInitializerFirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@Autowired
	MyService myService;
	
	//@RequestMapping
	@GetMapping("/test5")
	public String myMethod()
	{
		int i=0;
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		
		System.out.println("555");
		//System.out.println(myService.myServiceMethod());
		return myService.myServiceMethod();
	}
}	


