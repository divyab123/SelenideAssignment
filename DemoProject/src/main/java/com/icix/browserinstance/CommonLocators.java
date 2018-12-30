package com.icix.browserinstance;

import org.openqa.selenium.By;

// This class holding the common locators for throughout the framework

public class CommonLocators {
	public static By requestTab = By.xpath("//span[@class='slds-truncate'][text()='Requests']");
	public static By appLauncherBtn = By.xpath("//button[@class='slds-button']/div");
	public static By appLauncherPopUp = By.xpath("//div[@class='modal-container slds-modal__container']");
	public static By searchBaronAppLauncher = By.xpath("//input[@placeholder='Search apps or items...']");
	public static By frame = By.tagName("iframe");
	public static By ReqLink = By
			.xpath("//span[@class='label slds-truncate slds-text-link'][starts-with(.,'Requests')]");
	public static By mainSearch = By.xpath("//input[@role='combobox' and contains(@placeholder,'Search')]");
}
