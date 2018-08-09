package reportGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import initializer.Initializer;

public class ScreenshotGenerator extends Initializer {



public static void generateScreenshot(Scenario s) throws IOException{
	
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	InputStream stream=new FileInputStream(src);
	
	//Added by Vasanth to embed the screenshot into the report
	s.embed(IOUtils.toByteArray(stream), "image/jpeg");
	
}

}
