package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.order;
import com.example.demo.service.orderservice;
@RestController
@RequestMapping("/api/v1")
public class ordercontroller {
	@Autowired
	orderservice service;
	@PostMapping("/insertion")
	public ResponseEntity<order> insertion(@RequestBody order o) {
		order o1=service.addorder(o);
		return new ResponseEntity<order>(o1,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/getalldata")
	public ResponseEntity<List<order>> getall(){
		return ResponseEntity.ok(service.getall());
		
	}
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<order> getbyid(@PathVariable int id){
		return ResponseEntity.ok(service.getbyid(id));
		
	}
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable int id){
		return ResponseEntity.ok(service.deletebyid(id));
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<order> update(@PathVariable int id,@RequestBody order o){
		return ResponseEntity.ok(service.update(o, id));
		
	}
}
