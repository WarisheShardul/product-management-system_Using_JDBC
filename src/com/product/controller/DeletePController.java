package com.product.controller;

import com.product.service.ProductService;

public class DeletePController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		boolean res =productService.deleteProductbyId(3);
		System.out.println(res);
	}

}
