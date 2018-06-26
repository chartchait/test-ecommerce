package com.test.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.domain.ProductSubCatalog;

@Repository
public interface ProductSubCatalogRepository  extends CrudRepository<ProductSubCatalog, String>{

}
