package FirstTestNgProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_TestNg {
	public static FirefoxDriver driver;
	@BeforeTest
	public  void openUrl() {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Workspace1\\Driver\\geckodriver.exe");
		 driver=new FirefoxDriver();

		//WebDriverManager.firefoxdriver().setup();
		//RemoteWebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://testingshastra.com");

	}
	@Test (priority=0)
	public void toverifyTitle() throws IOException 
	{
		String title=driver.getTitle();
		System.out.println(title);
		String expectedTitle="Testing Shastra | Training | Placement";
		//System.out.println("Title is match");
		try {
			Assert.assertEquals(title, expectedTitle);
		}
		catch(AssertionError e) {
			System.out.println("Title is not match");
		}
		//Assert.assertEquals(title, "Testing Shastra | Training | Placement");
		File file=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Title.jpeg"));
	}
	@Test (priority=1)
	public static void AssignmentMethod() throws IOException, InterruptedException
	{
		try{
		driver.findElement(By.xpath("//a[text()='Assignments']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='confirmation alert'])[1]")).click();
		Thread.sleep(5000);
		}
		catch(NullPointerException e) {
			System.out.println("click on confirmation");
		}
		File file=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("confirmation.jpeg"));
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
