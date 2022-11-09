
package FirstTestNgProject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Ng_Project {
	@Test
	public static void m1() {
		System.setProperty("webdriver.gecko.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
		//chrome browser open
		//WebDriverManager.chromedriver().setup();
		//RemoteWebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		//driver.get("https://www.redbus.in/");
		driver.get("https://testingshastra.com");
		
		//firefox browser open
		//WebDriverManager.firefoxdriver().setup();
		//RemoteWebDriver driver=new FirefoxDriver();
		//driver.get("https://www.redbus.in/");
		//driver.get("https://testingshastra.com/");
		}
	@Test
	public static void tc02_ToVerifyOfApplication()
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String title=driver.getTitle();
		System.out.println( title);
		Assert.assertEquals(title, "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India");
	}
	}
