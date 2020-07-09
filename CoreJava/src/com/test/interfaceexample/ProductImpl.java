package com.test.interfaceexample;

public class ProductImpl implements Product {

	@Override
	public void getProductDetails(String id) {
		System.out.println("Product details for given product id::"+id);
	}

}
