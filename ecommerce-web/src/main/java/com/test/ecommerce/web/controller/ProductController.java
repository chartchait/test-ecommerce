package com.test.ecommerce.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.domain.Product;
import com.test.service.ProductService;

@Controller
@RequestMapping(path="/")
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@GetMapping("/product")
    public String initSearchPage(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "product-search";
    }
	
	@GetMapping("/product/create")
    public String initCreatePage(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("productSubCatalogs", new ArrayList<>());
		return "product-create";
	}
	
	@PostMapping("/product/create")
    public String createProduct(Model model) {
		return "redirect:/product";
	}
}
