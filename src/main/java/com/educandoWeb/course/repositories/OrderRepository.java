package com.educandoWeb.course.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.entities.OrderItem;
import com.educandoWeb.course.entities.pk.OrderItemPK;

public interface OrderRepository extends JpaRepository<OrderItem, OrderItemPK> {

	void saveAll(List<Order> asList);

	Optional<Order> findById(Long id);

	
}