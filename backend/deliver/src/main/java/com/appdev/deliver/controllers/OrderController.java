package com.appdev.deliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.deliver.dto.OrderDTO;
import com.appdev.deliver.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
@Autowired
private OrderService service;
@GetMapping
public ResponseEntity <List<OrderDTO>> findALL(){
	List<OrderDTO> list = service.findALL();
	return ResponseEntity.ok().body(list);
	
	
}
}
