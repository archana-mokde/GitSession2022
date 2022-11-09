package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenXpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
        FirefoxDriver driver1=new FirefoxDriver();
        driver1.manage().window().maximize();
       
        driver1.get("https://www.redbus.in/");
      
        driver1.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/input")).sendKeys("Pune");
        driver1.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[2]/div/input")).sendKeys("Amravati");
        //driver1.quit();
      //  /html/body/section/div[2]/main/section/div/div[2]/section/div[2]/div/input
	}

}
