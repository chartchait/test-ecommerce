package com.test.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, String>{
	public Product findByName(String name);
	public void deleteByName(String name);
}
