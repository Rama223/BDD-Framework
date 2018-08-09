package testCaseses;

import java.io.IOException;

import org.junit.AfterClass;

import initializer.DriverFunctions;
import initializer.Initializer;
import pagesObjects.HomePageObject;
import reportGenerator.ScreenshotGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class HomePageTest extends Initializer {

	@Given("^open browser as (.*)$")
	public void openBrowser(String browser) throws IOException {
		initailize(browser);
	}

	@Then("^enter url as (.*)$")
	public void enterUrl(String url) {

		DriverFunctions.loadUrl(url);
	}

	@Then("^enter userName as (.*)$")
	public void enterUserName(String userName) {

		HomePageObject.enterUserName(userName);
	}

	@Then("^enter mobileNo as (.*)$")
	public void enterMobileNo(String mobileNo) {
//		int i=1/0;
		HomePageObject.enterMobileNo(mobileNo);
	}

	@And("^enter pickup address as (.*)$")
	public void enterPicAdd(String picadd) {
		HomePageObject.enterPicAdd(picadd);
	}

	@Then("^enter drop address as (.*)$")
	public void enterDropAdd(String dropadd) {
		HomePageObject.enterDropAdd(dropadd);
	}

	@And("^select basic as (.*)$")
	public void selectBasic(String basic) {
		HomePageObject.selectBasic(basic);
	}

	@When("^click book later checkbox$")
	public void clickBookLater() {
		HomePageObject.clickBookLater();
	}

	@But("^dont click book button$")
	public void clickBook() {
		HomePageObject.clickBook();
	}
	
	@After
	public void teardown(Scenario s) throws IOException{
		System.out.println("The Id of Scenario:"+s.getId()+" The Name of Scenario:"+s.getName()+" The Status of Sceanrio:"+s.getStatus());
		if(s.getStatus().equalsIgnoreCase("Passed")){
			
			ScreenshotGenerator.generateScreenshot(s);
		}
	}
	

	

}
