package com.jl.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.jl.demo.model.Category;

@Repository
public class ProductDAO {

	@Autowired
	private RestTemplate restTemplate;
	@Value("${product.url}")
	private String url;
	
	public Category getProducts() {
		Category response=null;
		try {
			response = restTemplate.getForObject(url, Category.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
