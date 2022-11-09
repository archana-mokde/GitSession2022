package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.get("https://testingshastra.com/");
        System.out.println(driver.getTitle());
        
        driver.findElement(By.xpath("/html/body/div/nav/div/div[2]/ul/li[6]")).click();
        System.out.println(driver.getCurrentUrl());
        driver.quit();
	}

}
