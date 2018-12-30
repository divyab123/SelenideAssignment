package com.icix.producttest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.icix.functionality.ProductPageLogics;

// This class holding the Test Scenario and Steps for QA_181 Test Case
public class QA_181_Test {
	SoftAssert asserts = new SoftAssert();

	@Test
	public void CreateICIXProduct() throws Exception {
		ProductPageLogics.openPrdPage();
		String ActualHeading = ProductPageLogics.getTitle();
		asserts.assertEquals(ActualHeading, "ICIX Products");
		
		ProductPageLogics.clickNewBtn();
		ProductPageLogics.SelectTPName();
		boolean actualvalue = ProductPageLogics.enableSearchBtn();
		asserts.assertEquals(actualvalue, true);
		asserts.assertAll();
		ProductPageLogics.clickSearchBtn();
		
		ProductPageLogics.createProduct();
	}
}
