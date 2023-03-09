package com.carshop.domain;

import org.springframework.stereotype.Repository;

@Repository
public class OrderReositoryImpl implements OrderRepository {
	private Map<Long, Order> listOfOrders;
}
