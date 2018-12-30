package com.icix.productpage;

import org.openqa.selenium.By;

/*This class holding the Locators for send two actor request*/ 

public class TwoActorRequestLocators {
	public static By reqHeading = By.xpath("//span[@class='uiOutputText forceBreadCrumbItem'][text()='Requests']");
	public static By newreqBtn = By.xpath("//div[@class='slds-truncate'][text()='New']");
	public static By reqName = By.xpath("//input[@id='requestName']");
	public static By tradingptnrName = By.xpath("//input[@placeholder='Select a Trading Partner']");
	public static By selectTP = By.xpath("//span[@class='clickable ng-binding']");
	public static By selectDocForm = By.xpath("//button[text()='Select Documents / Forms']");
	public static By attachBtn = By.xpath("//span[text()='Attach']");
	public static By skipBtn = By.xpath("//span[text()='Skip']");
	public static By saveBtnPopUp = By.xpath("//span[@class='ng-binding ng-scope'][text()='Save']");
	public static By commentsInputBox = By.xpath("//textarea[@id='comments']");
	public static By sendReq = By.xpath("//span[@class='ng-binding ng-scope'][text()='Send']");
	public static By confirmReq = By.xpath("//div[@id='sendRequestTable']/../../div[3]/button[3]/span[text()='Yes']");
	public static By clicksearchReq = By.xpath("//mark[@class='data-match']/../../../div/div[text()='Request']");
	public static By reqnameLabel = By.xpath("//label[text()='Request name']");
}
