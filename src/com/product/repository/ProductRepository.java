package com.product.repository;

import java.util.List;

import com.product.bean.ProductConstuctor;
import com.product.util.CsvReader;

public class ProductRepository {
		
		List<ProductConstuctor> itemsList;
		
		public ProductRepository() {
			CsvReader csvReader = new CsvReader();
			itemsList = csvReader.getProductsFromCsv();
		}
		
		public List<ProductConstuctor> getItems(){
			return this.itemsList;
		}
	}
