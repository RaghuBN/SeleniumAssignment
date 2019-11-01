package MultipleBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MultipleBrowsers.Snapshot;


public class TestSuite {
	String baseUrl="https://www.easycalculation.com/index.php";
	WebDriver driver;
	@Test
	@Parameters("Browsers")
	public void LaunchChromeBrowser(String BrowserName) throws Exception {
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome\\chromedriver.exe");
			System.setProperty("webdriver.driver.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get(baseUrl);
		    Snapshot.ScreenshotExample(driver, "EasyCalculation.com");
			driver.findElement(By.linkText("Age Calculator")).click();
		    driver.findElement(By.id("i21")).sendKeys("6");
		    driver.findElement(By.id("i22")).sendKeys("10");
		    driver.findElement(By.id("i23")).sendKeys("1997");
		    Snapshot.ScreenshotExample(driver, "Age Calculation");
			driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[3]/form/table/tbody/tr[10]/td/input[1]")).click();
			driver.findElement(By.linkText("Calculators")).click();
			driver.findElement(By.linkText("Concrete volume")).click();
		    driver.findElement(By.id("diam")).sendKeys("6");
		    driver.findElement(By.id("dept")).sendKeys("8");
		    driver.findElement(By.id("quant")).sendKeys("4");
		    Snapshot.ScreenshotExample(driver, "Concrete volume Calculation");

	    //driver.quit();
	}
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{

			System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\Firefox\\geckodriver.exe");
			System.setProperty("webdriver.gecko.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get(baseUrl);
		driver.findElement(By.linkText("Age Calculator")).click();
	    driver.findElement(By.id("i21")).sendKeys("6");
	    driver.findElement(By.id("i22")).sendKeys("10");
	    driver.findElement(By.id("i23")).sendKeys("1997");
		driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[3]/form/table/tbody/tr[10]/td/input[1]")).click();
		driver.findElement(By.linkText("Calculators")).click();
		driver.findElement(By.linkText("Concrete volume")).click();
	    driver.findElement(By.id("diam")).sendKeys("6");
	    driver.findElement(By.id("dept")).sendKeys("8");
	    driver.findElement(By.id("quant")).sendKeys("4");

			// driver.quit();	
		}

		else if(BrowserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver","C:\\Selenium Jars\\Internet Explorer\\64-bit\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.bin","C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
			 driver=new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.get(baseUrl);
		driver.findElement(By.linkText("Age Calculator")).click();
	    driver.findElement(By.id("i21")).sendKeys("6");
	    driver.findElement(By.id("i22")).sendKeys("10");
	    driver.findElement(By.id("i23")).sendKeys("1997");
		driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[3]/form/table/tbody/tr[10]/td/input[1]")).click();
		driver.findElement(By.linkText("Calculators")).click();
		driver.findElement(By.linkText("Concrete volume")).click();
	    driver.findElement(By.id("diam")).sendKeys("6");
	    driver.findElement(By.id("dept")).sendKeys("8");
	    driver.findElement(By.id("quant")).sendKeys("4");
		driver.findElement(By.linkText("Result")).click();
			 driver.quit();	
		}
	}	
}

