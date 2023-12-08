package com.product.controller;

import com.product.service.ProductService;

public class GetAllPController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		productService.getAll(null);
	}

}
