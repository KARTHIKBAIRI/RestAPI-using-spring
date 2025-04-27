package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.order;
import com.example.demo.service.orderservice;

@Controller
public class WebController {

	@Autowired
	orderservice service;
	@PostMapping("/insert")
	public String addemployee(@ModelAttribute("order") order o, Model m) {
		m.addAttribute("order",o);
		return "weelcome";
	}
}
