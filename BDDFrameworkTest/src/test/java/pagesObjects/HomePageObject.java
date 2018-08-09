package pagesObjects;

import initializer.DriverFunctions;
import initializer.Initializer;

import org.openqa.selenium.WebElement;

//Page Object Class added by Vasanth
public class HomePageObject extends Initializer {

	public static void enterUserName(String userName) {

	getWebelementByXpath("HOMEPAGE_TYPE_USERNAME_XPATH").sendKeys(userName);
	}

	public static void enterMobileNo(String mobileNo) {
		getWebelementByXpath("HOMEPAGE_TYPE_MOBILENO_XPATH").sendKeys(mobileNo);
	}

	public static void enterPicAdd(String picadd) {
		getWebelementByXpath("HOMEPAGE_TYPE_PICADD_XPATH").sendKeys(picadd);
	}

	public static void enterDropAdd(String dropadd) {
		getWebelementByXpath("HOMEPAGE_TYPE_DROPADD_XPATH").sendKeys(dropadd);
	}

	public static void selectBasic(String basic) {

		WebElement element=getWebelementByXpath("HOMEPAGE_SELECT_BASIC_XPATH");
		DriverFunctions.selectDropDownByVisisbleText(element, basic);
	}

	public static void clickBookLater() {
		getWebelementByXpath("HOMEPAGE_CLICK_BOOKLATER_XPATH").click();
	}
	
	
	public static void clickBook() {
		getWebelementByXpath("HOMEPAGE_CLICK_BOOKBUTTON_XPATH").click();
	}

}
