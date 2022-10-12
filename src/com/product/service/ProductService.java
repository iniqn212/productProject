package com.product.service;

import java.util.List;
import com.product.bean.ProductConstuctor;
import com.product.repository.ProductRepository;

public class ProductService {

	ProductRepository itemsRepository;

	public ProductService() {
	this.itemsRepository = new ProductRepository();
	}

	
	public List<ProductConstuctor> getItemsDetails() {
		return this.itemsRepository.getItems();
		
		
	}
}
