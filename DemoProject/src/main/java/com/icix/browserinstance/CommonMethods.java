package com.icix.browserinstance;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

// This class holding the common waits and methods for throughout the framework
public class CommonMethods {
	public static final long WAIT_VALUE = 90000;

	public static void switchtoPopUp() {
		WebDriverRunner.getWebDriver().switchTo().activeElement();
	}

	public static void openAppLauncher() throws Exception {
		$(CommonLocators.appLauncherBtn).waitUntil(Condition.visible, 90000).click();
		WebDriverRunner.getWebDriver().switchTo().defaultContent();
	}

	public static void scrollToElementVertically(By element) throws AWTException {
		((JavascriptExecutor) getWebDriver())
				.executeScript("window.scrollTo(0," + getWebDriver().findElement(element).getLocation().y + ")");
	}
}// end class
