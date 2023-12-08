package com.product.controller;

import com.product.service.CustomerService;

public class DeleteController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		boolean res= customerService.deleteCustomerbyId(7);
		System.out.println(res);
	}

}
