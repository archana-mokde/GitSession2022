package parallel_excuition;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionClass {
	public static WebDriverManager driver; 

//	public static void verifyChromeBrowser() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		RemoteWebDriver driver=new ChromeDriver();
//		driver.get("https://www.redbus.in/");
//		Thread.sleep(5000);
//		//driver.findElement(By.xpath("//a[text()='Videos']")).click();
//		driver.quit();
	


	@Test
	public static void verifyFireFox() throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://testingshastra.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Videos']")).click();
		Set<String> WinHandles=driver.getWindowHandles();
		for(String CurrentH:WinHandles) 
		{
			driver.switchTo().window(CurrentH);
			try {
				
			String ele=driver.findElement(By.xpath("//yt-formatted-string[text()='Subscribe']")).getText();
	
			if(ele.contains("Subscribed")) {
			//if(driver.findElement(By.xpath("//tp-yt-paper-button[@class='style-scope ytd-subscribe-button-renderer']")).getText().contains("Subscribe"));
			  break;
			}
			//tp-yt-paper-button[@class='style-scope ytd-subscribe-button-renderer']
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		Thread.sleep(5000);
		File file=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("subscribe.jpeg"));
		
		//driver.findElement(By.xpath("//a[text()='Videos']")).click();
		driver.quit();
	}



}

