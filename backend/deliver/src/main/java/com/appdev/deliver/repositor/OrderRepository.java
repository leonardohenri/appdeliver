package com.appdev.deliver.repositor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appdev.deliver.entidades.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
@Query("SELECT DISTINCT busca FROM Order busca JOIN FETCH busca.products "
		+ "WHERE busca.Status = 0 ORDER BY busca.moment ASC")
	List<Order>findOrdersWithProducts();
}
