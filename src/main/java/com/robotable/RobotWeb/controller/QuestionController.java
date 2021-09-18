package com.robotable.RobotWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

	  @GetMapping("/question")
	    public String main() {


	        return "question"; //view
	    }
}
