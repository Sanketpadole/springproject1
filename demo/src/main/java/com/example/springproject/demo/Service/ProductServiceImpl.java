package com.example.springproject.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springproject.demo.entities.Product;
@Service

public class ProductServiceImpl implements ProductService {
	
	List<Product>list;
	
	public ProductServiceImpl() {
	
	list =new ArrayList<>();
	list.add(new Product(145,"hello there","hfkfkwjf"));
	list.add(new Product(4343,"Spring boot","fghkil"));
	}
	



	@Override
	public List <Product>  getProducts() {
		// TODO Auto-generated method stub
		return list;
	}




	

}
