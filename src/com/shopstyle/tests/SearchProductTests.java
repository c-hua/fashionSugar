package com.shopstyle.tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.*;

import com.shopstyle.PopSugarProducts;
import com.shopstyle.ShopStyleSearch;

public class SearchProductTests {

	@Test 
	public void simpleSearchTest() throws MalformedURLException, IOException {
		ShopStyleSearch search = new ShopStyleSearch("uid4256-23662016-24");
		PopSugarProducts products = search.search("Red Dress");
		Assert.assertNotNull(products);
		Assert.assertTrue(products.getProducts().isEmpty() == false);
	}
}
