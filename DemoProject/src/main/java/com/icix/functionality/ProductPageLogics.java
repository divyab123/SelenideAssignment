package com.icix.functionality;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.icix.browserinstance.CommonMethods;
import com.icix.productpage.ProductPageLocators;

/*This class holding the logics of ICIX Product Creation
*/

public class ProductPageLogics {
	public static long waitFor = 90000;
	static CommonMethods commonLocators = new CommonMethods();

	// This method is for Open the ICIX Product Page
	public static void openPrdPage() throws Exception {
		$(ProductPageLocators.icixprdctPage).waitUntil(Condition.appear, waitFor).click();
	}

	// This method is for getting the Title of ICIX Product Page
	public static String getTitle() {
		return $(ProductPageLocators.prdheading).getText();
	}

	// This method is for clicks on New button of ICIX Product Page
	public static void clickNewBtn() throws Exception {
		$(ProductPageLocators.newprdbtn).waitUntil(Condition.appear, waitFor).click();
	}

	// This method is for searching the Trading Partner for ICIX Product Page
	public static void searchTP() throws Exception {
		try {
			$$(ProductPageLocators.frame).size();
			WebDriverRunner.getWebDriver().switchTo().frame(0);
			$(ProductPageLocators.searchTPbox).waitUntil(Condition.visible, waitFor)
					.setValue("QA Org 2 Automation Res Pkg Stg");
		} catch (Exception e) {
			System.out.println("Element not found");
		}
	}

	// This method selecting the TP name after searching the TP from elastic search
	public static void selectTPName() {
		try {
			sleep(4000);
			$(ProductPageLocators.selectTPName).waitUntil(Condition.visible, waitFor).click();
		} catch (Exception e) {
			System.out.println("TP Name is not find/ clickable");
		}
	}

	// This method is for clicking on Search button after searching the TP
	public static void clickSearchBtn() throws Exception {
		$(ProductPageLocators.searchBtn).waitUntil(Condition.visible, waitFor).click();
	}

	// This methods checks Search button is enable or not for TP search
	public static boolean enableSearchBtn() {
		return $(ProductPageLocators.searchBtn).isEnabled();
	}

	// Common method for Search and Select TP name
	public static void SelectTPName() throws Exception {
		searchTP();
		selectTPName();
	}

	// This method is for clicking on Create Product button
	public static void clickcreateProduct() {
		try {
			$(ProductPageLocators.createPrd).waitUntil(Condition.visible, waitFor).click();
		} catch (Exception e) {
			System.out.println("Create Product button is not visible/ clickable");
		}
	}

	// This method is for entering Product name in Product name input box
	public static void enterPrdName() {
		try {
			$(ProductPageLocators.prdName).setValue("Test");
		} catch (Exception e) {
			System.out.println("Product name Input box is not visible");
		}
	}

	// This method is for select product ID from ID picklist
	public static void selectID() throws Exception {
		$(ProductPageLocators.selectPrdID).waitUntil(Condition.visible, waitFor).selectOptionContainingText("ISBN");
	}

	// This method is for entering ID value in value input box
	public static void enterIDvalue() throws Exception {
		$(ProductPageLocators.enterID).waitUntil(Condition.visible, waitFor).setValue("4547657");
	}

	// This method is for clicking on Next button of product form
	public static void clickNextBtn() throws Exception {
		$(ProductPageLocators.nextBtn).waitUntil(Condition.visible, waitFor).click();
	}

	// This method is for searching TP at the time of product creation and select
	// that TP
	public static void searchndclickTPforPrd() throws Exception {
		$(ProductPageLocators.searchTPforProductpage).setValue("QA Org 2 Automation Res Pkg Stg");
		sleep(6000);
		$(ProductPageLocators.selectTPnameforProductpage).click();
	}

	// This method is for selecting relationship type and status for particular
	// product
	public static void selectRelatStausndType() throws Exception {
		sleep(5000);
		$(ProductPageLocators.selectrelatstatus).selectOptionContainingText("Active");
		$(ProductPageLocators.selectrelattype).waitUntil(Condition.visible, waitFor).selectOptionContainingText("Buy");
		$(ProductPageLocators.saveBtn).waitUntil(Condition.visible, waitFor).click();
	}

	// Common method for creating the product
	public static void createProduct() throws Exception {
		clickcreateProduct();
		enterPrdName();
		selectID();
		enterIDvalue();
		clickNextBtn();
		searchndclickTPforPrd();
		selectRelatStausndType();
	}
}
