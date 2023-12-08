package com.product.controller;

import com.product.dto.ProductDto;
import com.product.service.ProductService;

public class ProductController {
	public static void main(String[] args) {
		ProductDto productDto=new ProductDto();
		productDto.setId(6);
		productDto.setName("ColdDrink");
		productDto.setPrice(45);
		
		ProductService productService=new ProductService();
		ProductDto p=productService.saveProduct(productDto);
		if(p!=null) {
			System.out.println(p.getId()+"save successfully");
		}
	}

}
