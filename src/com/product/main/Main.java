package com.product.main;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.product.bean.ProductConstuctor;
import com.product.service.ProductService;

public class Main {

	public static void main(String[] args) {

		List<ProductConstuctor> itemsList;

		ProductService productService = new ProductService();
		itemsList = productService.getItemsDetails();

		
		List<ProductConstuctor> itemsHighPrice = itemsList.stream().filter(item -> item.getPrice() >= 1)
				.collect(Collectors.toList());

		itemsHighPrice.stream().forEach((item) -> {
			System.out.println(item);
			});

	
		List<String> productDelivers = itemsList.stream().map(ProductConstuctor::getDeliver).collect(Collectors.toList());
		productDelivers.stream().forEach(System.out::println);
		
		List<ProductConstuctor> productSortedByQuantity = itemsList.stream().sorted(Comparator.comparing(ProductConstuctor::getQuantity)).collect(Collectors.toList());
		productSortedByQuantity.stream().forEach(System.out::println);
	}

}
