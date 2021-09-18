package com.robotable.RobotWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HelloWorldController   
{  
@RequestMapping("/hi")  
public String hello()   
{  
return "Hello javaTpoint";  
}  
}  
