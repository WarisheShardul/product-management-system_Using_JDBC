package com.product.controller;

import com.product.service.CustomerService;

public class UpdateController {
    public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		boolean res=customerService.UpdateCustomerbyId(2, "VileParle");
		System.out.println(res);
		System.out.println("welcome to VileParle");
	}
}
