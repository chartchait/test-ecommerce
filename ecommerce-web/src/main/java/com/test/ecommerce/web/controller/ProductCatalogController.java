package com.test.ecommerce.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.domain.ProductCatalog;
import com.test.service.ProductCatalogService;

@Controller
public class ProductCatalogController {
	@Autowired
	private ProductCatalogService productCatalogService;

	@GetMapping("/productcatalog")
	public String initPage(Model model) {
		List<ProductCatalog> productCatalogs = productCatalogService.findAll();
		model.addAttribute("productCatalogs", productCatalogs);
		return "productcatalog-search";
	}
}
