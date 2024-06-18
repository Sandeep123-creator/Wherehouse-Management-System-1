package com.jsp.whs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.whs.moduls.Wherehouse;
import com.jsp.whs.service.WherehouseService;
import com.jsp.whs.util.ResponseStructure;

@RestController
@RequestMapping("/wherehouses")
public class WherehouseController {
	@Autowired
	private WherehouseService service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Wherehouse>> saveWherehouse(@RequestBody Wherehouse wherehouse ){
		return service.saveWherehouse(wherehouse);
		
	}
	
	public String wherehouseCreated() {
		return null;
		
	}
}
