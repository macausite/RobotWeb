package com.robotable.RobotWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StockController {

	  @GetMapping("/stock")
	    public String main() {


	        return "stock.html"; //view
	    }
}
