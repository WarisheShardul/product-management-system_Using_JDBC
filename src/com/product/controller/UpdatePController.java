package com.product.controller;

import com.product.service.ProductService;

public class UpdatePController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		boolean res=productService.UpdateProductbyId(02, "Milk");
		System.out.println(res);
		System.out.println("finally updated");
	}

}
