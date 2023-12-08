package com.product.service;

import com.product.dao.ProductDao;
import com.product.dto.ProductDto;

public class ProductService {
	ProductDao productDao=new ProductDao();
	
	public ProductDto saveProduct(ProductDto product) {
		return productDao.saveProduct(product);
	}
	
	public boolean UpdateProductbyId(int id, String name) {
		return productDao.UpdateProductbyId(id, name);
	}

	public boolean deleteProductbyId(int id) {
		return productDao.deleteProductbyId(id);
	}
	
	public ProductDto getAll(ProductDto i) {
		return productDao.getAll(i);
	}
	public void getAll(int i) {
//		TODO Auto generated method stub
	}
}
