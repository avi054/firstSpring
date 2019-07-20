package com.example.springInitializerFirstproject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class MyService 
{
	public String myServiceMethod()
	{
		int i=0;
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		System.out.println("line: "+ ++i);
		
		return "Welcome to ";
	}
}
