package com.example.springproject.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springproject.demo.Service.ProductService;
import com.example.springproject.demo.entities.Product;

@RestController



public class HelloController {
	@Autowired
	private ProductService productService;
	
	
//	@GetMapping("/hello")
//	
//	public String hello() {
//		return "this is me how are you";
//	}
		
	
	@GetMapping("/products")
	public List<Product>getProducts(){
		return this.productService.getProducts();

}
}
