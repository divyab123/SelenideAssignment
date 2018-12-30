package com.icix.functionality;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.icix.browserinstance.CommonLocators;
import com.icix.browserinstance.CommonMethods;
import com.icix.browserinstance.ReadTestData;
import com.icix.productpage.TwoActorRequestLocators;

/*This Class holding the functionality and Logics of Sending Two Actor Request and
Search that request at responder end while it is created successfully or not.*/

public class TwoActorRequestLogics {
	public static long waitFor = 90000;

	// This method is for getting the heading of Request Page
	public static String getHeadingofReqPage() {
		return $(TwoActorRequestLocators.reqHeading).waitUntil(Condition.visible, waitFor).getText();
	}

	// This method is for Open Request Page
	public static void openReqPage() throws Exception {
		CommonMethods.openAppLauncher();
		$(CommonLocators.ReqLink).waitUntil(Condition.visible, waitFor).click();
		Assert.assertEquals(getHeadingofReqPage(), "Requests");
	}

	// This method is for clicking on New button of Request page
	public static void clickNewBtn() throws Exception {
		$(TwoActorRequestLocators.newreqBtn).waitUntil(Condition.visible, waitFor).click();
	}

	// This method is for entering the request name
	public static void EnterReqName() {
		ReadTestData.ReadData1();
		try {
			sleep(waitFor);
			$$(CommonLocators.frame).size();
			WebDriverRunner.getWebDriver().switchTo().frame(0);
			$(TwoActorRequestLocators.reqName).waitUntil(Condition.visible, waitFor);
			$(TwoActorRequestLocators.reqName).setValue(ReadTestData.vRequestName);
		} catch (Exception e) {
			System.out.println("Element not found");
		}
	}

	// This method is for searching the Trading Partner Name
	public static void SearchTpName() throws Exception {
		$(TwoActorRequestLocators.tradingptnrName).waitUntil(Condition.visible, waitFor).setValue(ReadTestData.vTPname);
	}

	// This method is for Selecting the searched Trading Partner name
	public static void SelectTP() throws Exception {
		$(TwoActorRequestLocators.selectTP).waitUntil(Condition.visible, waitFor).click();
	}

	// This method is for clicking on Document/ Form button
	public static void ClickDocumentBtn() throws Exception {
		$(TwoActorRequestLocators.selectDocForm).waitUntil(Condition.visible, waitFor).click();
		CommonMethods.switchtoPopUp();
		$(By.xpath("//span[text()='" + ReadTestData.vFormName + "']")).waitUntil(Condition.visible, waitFor).click();
	}

	// This method is for clicking on Attach button
	public static void clickAttachBtn() throws Exception {
		$(TwoActorRequestLocators.attachBtn).waitUntil(Condition.visible, waitFor).click();
	}

	// This method is for clicking on Skip button
	public static void clickSkipBtn() throws Exception {
		$(TwoActorRequestLocators.skipBtn).waitUntil(Condition.visible, waitFor).click();
	}

	// This method is for clicking on Save button
	public static void clickSavBtnPopUp() throws Exception {
		$(TwoActorRequestLocators.saveBtnPopUp).waitUntil(Condition.visible, waitFor);
		$(TwoActorRequestLocators.saveBtnPopUp).click();
	}

	// This method is entering the comments
	public static void enterComments() throws InterruptedException, AWTException {
		CommonMethods.scrollToElementVertically(TwoActorRequestLocators.commentsInputBox);
		$(TwoActorRequestLocators.commentsInputBox).waitUntil(Condition.visible, waitFor)
				.setValue(ReadTestData.vComments);
	}

	// This method is checking the presence of confirmation popup
	public static boolean checkPresenceofPopUp() {
		return $(TwoActorRequestLocators.confirmReq).waitUntil(Condition.appear, waitFor).isDisplayed();
	}

	// This method is clicking on Send request button
	public static void clickSendBtn() throws Exception {
		sleep(60000);
		$(TwoActorRequestLocators.sendReq).waitUntil(Condition.appear, waitFor).click();
		Assert.assertEquals(checkPresenceofPopUp(), true);
	}

	// This method is clicking on Yes button for confirmation of sending request
	public static void ConfirmRequest() throws Exception {
		$(TwoActorRequestLocators.confirmReq).waitUntil(Condition.appear, waitFor);
		CommonMethods.switchtoPopUp();
		$(TwoActorRequestLocators.confirmReq).click();
	}

	// This method holding the functionality of sending Two Actor Request
	public static void SendTwoActorRequest() throws Exception {
		EnterReqName();
		SearchTpName();
		SelectTP();
		ClickDocumentBtn();
		clickAttachBtn();
		// clickSkipBtn();
		clickSavBtnPopUp();
		enterComments();
		clickSendBtn();
		ConfirmRequest();
	}

	// This method is searching the sent request from Main search bar
	public static void searchReq() throws Exception {
		$(CommonLocators.mainSearch).waitUntil(Condition.visible, waitFor).setValue(ReadTestData.vRequestName);
	}

	// This method is for clicking on searched request
	public static void clicksearchReq() throws Exception {
		sleep(90000);
		$(TwoActorRequestLocators.clicksearchReq).waitUntil(Condition.visible, waitFor).click();
		Assert.assertEquals(searchedReqHeading(), ReadTestData.vRequestName);
	}

	// This method is for getting the heading of searched request
	public static String searchedReqHeading() {
		return $(By.xpath("//h1/span[text()='" + ReadTestData.vRequestName + "']"))
				.waitUntil(Condition.visible, waitFor).getText();
	}

	// This method is holding the functionality of search created request
	public static void searchCreatedRequest() throws Exception {
		searchReq();
		clicksearchReq();
	}

}// end class
