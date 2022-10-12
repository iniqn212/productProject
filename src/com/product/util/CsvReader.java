package com.product.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.product.bean.ProductConstuctor;

public class CsvReader {

	private static final String PRODUCTS_CSV_FILE_PATH = "C://Users//iniqn//eclipse-workspace//Product_Project//ProductsList.csv";

	public List<ProductConstuctor> getProductsFromCsv() {
		List<ProductConstuctor> productList = null;

		try (BufferedReader br = new BufferedReader(new FileReader(new File(PRODUCTS_CSV_FILE_PATH)))) {
			br.readLine();
			String productData;
			productList = new ArrayList<>();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			while ((productData = br.readLine()) != null) {
				String[] productInfo = productData.split(",");
				ProductConstuctor product = new ProductConstuctor();
				product.setId(Integer.parseInt(productInfo[0]));
				product.setName(productInfo[1]);
				product.setQuantity(Integer.parseInt(productInfo[2]));
				product.setDateOfPurchase( LocalDate.parse(productInfo[3], formatter));
				product.setPrice(Float.parseFloat(productInfo[4]));
				product.setDeliver(productInfo[5]);

				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
}