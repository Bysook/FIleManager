package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.modelControl;

@Controller
public class appController {
	
	@Autowired
	modelControl control = new modelControl();
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("carpetas", control.getFolderData());
		return "index";
	}
	
	@GetMapping("/index")
	public String indexFull(Model model) {
		model.addAttribute("carpetas", control.getFolderData());
		return "index";
	}
	
}
