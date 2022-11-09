package FirstTestNgProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class screenshotusing_Selenium {

	public static void screenshotusing_Selenium_Example() throws IOException
	{
		
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://testingshastra.com");
		driver.manage().window().maximize();
		File file=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("screenshot.jpeg"));
	}
}
