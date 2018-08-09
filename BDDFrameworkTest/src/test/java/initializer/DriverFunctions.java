package initializer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriverFunctions  extends Initializer{

	
	public static void selectDropDownByVisisbleText(WebElement element, String basic){
		
		Select s=new Select(element);
		s.selectByVisibleText(basic);
	}
	
	
	public static void loadUrl(String url){
		wd.get(url);
	}
}
