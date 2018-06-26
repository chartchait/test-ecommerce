package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.test.domain.Product;
import com.test.repo.ProductRepository;
import com.test.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		List<Product> products = Lists.newArrayList(productRepository.findAll());

		return products;
	}

	@Override
	public Product create(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {
		if(productRepository.existsById(product.getId())) {
			return productRepository.save(product);
		}
		return product;
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}

}
