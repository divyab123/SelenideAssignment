package com.icix.browserinstance;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

// This class is for Launch browser and Login salesforce.com

public class BrowserInstance {
	@Parameters({ "vUsername", "vPassword" })
	@BeforeTest
	public static void beforeTest(@Optional("") String vUsername, @Optional("") String vPassword)
			throws InterruptedException {
		open("https://login.salesforce.com");
		ReadTestData.ReadData();
		$(By.id("username")).waitUntil(Condition.visible, 90000).setValue(ReadTestData.vUsername);
		$(By.id("password")).waitUntil(Condition.visible, 90000).setValue(ReadTestData.vPassword);
		$(By.id("Login")).click();
		WebDriverRunner.getWebDriver().manage().window().maximize();
		sleep(90000);
	}
}
