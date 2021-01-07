package com.appdev.deliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appdev.deliver.dto.ProductDTO;
import com.appdev.deliver.entidades.Product;
import com.appdev.deliver.repositor.ProductRepository;


@Service
public class ProductService  {

	@Autowired
	private ProductRepository repository;
@Transactional(readOnly = true)
	public List<ProductDTO> findALL(){
	List<Product> list = repository.findAll();
	return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());

		}
}
