package MultipleBrowsers;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Snapshot {
	public static void ScreenshotExample(WebDriver driver,String screenShotName) throws Exception{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("./Screenshot/"+screenShotName+".png"));
			System.out.println("Screenshot taken successfully");
		}
		catch(Exception e)
	{
	System.out.println("Exception Screen Shot: "+e.getMessage());

	}
	}
}
