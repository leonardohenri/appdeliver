package com.appdev.deliver.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.deliver.entidades.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
