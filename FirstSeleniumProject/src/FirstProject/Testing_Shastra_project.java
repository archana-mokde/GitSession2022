package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Shastra_project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/input")).sendKeys("pune");
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[2]/div/input")).sendKeys("Yvatmal");
		//
		
		//relative xpath using id
		//driver.findElement(By.id(""))
		
		
	      
	}

}
