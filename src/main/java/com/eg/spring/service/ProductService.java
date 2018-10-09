package com.eg.spring.service;

import com.eg.spring.model.Product;

public interface ProductService {

	Product getByName(String name);
	void refreshAllProducts();
	Product updateProduct(Product product);
	
}
