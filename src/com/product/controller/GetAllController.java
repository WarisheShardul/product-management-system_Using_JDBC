package com.product.controller;

import com.product.service.CustomerService;

public class GetAllController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		customerService.getAll(null);
	}

}
