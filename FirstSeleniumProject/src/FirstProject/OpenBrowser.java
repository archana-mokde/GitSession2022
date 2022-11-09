package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		//it is open chrome browser
		
		System.setProperty("webdriver.chrome.driver","D:\\java_workspace\\FirstSeleniumProject\\Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://testingshastra.com/");
		driver.get("http://testingshastra.com/");
		 driver.findElement(By.xpath("/html/body/div/nav/div/div[2]/ul/li[6]")).click();
		
		// it is open firefox browser
		/*System.setProperty("webdriver.gecko.driver","D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com/");*/
		
	}

}
