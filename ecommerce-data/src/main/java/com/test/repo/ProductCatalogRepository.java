package com.test.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.domain.ProductCatalog;

@Repository
public interface ProductCatalogRepository  extends CrudRepository<ProductCatalog, String>{

}
