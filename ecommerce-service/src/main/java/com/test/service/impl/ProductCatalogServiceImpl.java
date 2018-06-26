package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.test.domain.ProductCatalog;
import com.test.repo.ProductCatalogRepository;
import com.test.service.ProductCatalogService;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {

	@Autowired
	private ProductCatalogRepository productCatalogRepository;
	
	@Override
	public List<ProductCatalog> findAll() {
		return Lists.newArrayList(productCatalogRepository.findAll());
	}

}
