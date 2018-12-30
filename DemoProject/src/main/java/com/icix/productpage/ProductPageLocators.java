package com.icix.productpage;

import org.openqa.selenium.By;

// This class holding the locators from go to ICIX product to Create ICIX Product
public class ProductPageLocators {

	public static By icixprdctPage = By.xpath("//span[@class='slds-truncate'][text()='ICIX Products']");
	public static By newprdBtn = By.xpath("//div[text()='New']");
	public static By prdheading = By
			.xpath("//li[@class='slds-breadcrumb__item slds-line-height--reset']/span[text()='ICIX Products']");
	public static By newprdbtn = By.xpath(
			"//ul[@class='branding-actions slds-button-group slds-m-left--xx-small oneActionsRibbon forceActionsContainer']/li/a/div[text()='New']");
	public static By searchTPbox = By.xpath(
			"//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon--right ng-scope']/input[@role='combobox']");
	public static By frame = By.tagName("iframe");
	public static By selectTPName = By.xpath("//span[@class='clickable ng-binding']");
	public static By searchBtn = By.xpath("//button[@id='btnProductSearch'][text()='Search']");
	public static By createPrd = By.xpath("//button[@id='btnCreateProduct'][text()='Create Product']");
	public static By prdName = By.xpath("//input[@id='ProductName']");
	public static By selectPrdID = By
			.xpath("//select[@class='slds-select ng-pristine ng-untouched ng-valid ng-scope ng-empty']");
	public static By enterID = By
			.xpath("//div[@class='slds-grid slds-p-bottom--x-small ng-scope']/div/input[@type='text']");
	public static By nextBtn = By.xpath("//button[@id='btn_UPRelationship_Next']");
	public static By searchTPforProductpage = By
			.xpath("//div[@class='slds-form-element__control']/input[@type='text']");
	public static By selectTPnameforProductpage = By
			.xpath("//div[@class='slds-media__body']/span/h3[text()='QA Org 2 Automation Res Pkg Stg']");
	public static By selectrelatstatus = By.xpath("//select[@id='ddl_UPRelationship_Status']");
	public static By selectrelattype = By.xpath("//select[@id='ddl_UPRelationship_Type']");
	public static By saveBtn = By.xpath("//span[text()='Save']");

}
