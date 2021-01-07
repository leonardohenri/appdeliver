package com.appdev.deliver.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.deliver.entidades.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
