package com.test.service;

import java.util.List;

import com.test.domain.Product;

public interface ProductService {
	public List<Product> findAll();
	
	public Product create(Product product);
	
	public Product update(Product product);
	
	public void delete(Product product);
}
