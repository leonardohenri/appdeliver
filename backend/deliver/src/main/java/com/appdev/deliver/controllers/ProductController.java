package com.appdev.deliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.deliver.dto.ProductDTO;
import com.appdev.deliver.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
@Autowired
private ProductService service;
@GetMapping
public ResponseEntity <List<ProductDTO>> findALL(){
	List<ProductDTO> list = service.findALL();
	return ResponseEntity.ok().body(list);
	
	
}
}
