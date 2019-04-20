package com.jl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jl.demo.dto.ProductDTO;
import com.jl.demo.service.CategoryService;

@RestController
public class ProductCategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/products")
    public List<ProductDTO> getProducts(@RequestParam(required=false, defaultValue="ShowWasNow", name="labelType") String labelType) 
    {
		return categoryService.getFormatedProducts(labelType);
    }

}
