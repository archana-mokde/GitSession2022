package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testingshastra.com/");
        //open assignment page in testing shatra.
       // driver.findElement(By.xpath("/html/body/div/nav/div/div[2]/ul/li[5]/a")).click();
        
        //open assignment page using id in relative path
       // driver.findElement(By.id("menu-item-354")).click();
        
        //open notes page using id
        //driver.findElement(By.id("menu-item-354")).click();
        
        //open home page using id
        //driver.findElement(By.id("menu-item-255")).click();
        
        //open courses page using id
        //driver.findElement(By.id("menu-item-153")).click();
        
        //open recent placement page using id
        //driver.findElement(By.id("menu-item-363")).click();
        
        //open videos page using id
        //driver.findElement(By.id("menu-item-353")).click();
        
        //open contact us page using id
       // driver.findElement(By.id("menu-item-251")).click();
        
        //open notes using tag name 
       // driver.findElement(By.xpath("//a[@href=\"/notes\"]")).click();
        
      // driver.findElement(By.xpath("//a[@href=\"/assignments\"]")).click();
       
       //open assignment page using class
       //driver.findElement(By.xpath("(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-354\"])[1]")).click();
        
        //open  notes page using class
     
       // driver.findElement(By.xpath("(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-354\"])[2]")).click();
    	  
        //open notes page using xpath using tagname
        //driver.findElement(By.xpath("//a[@href=\"/notes\"]")).click();
        
        //open assignment page using xpath--text function
       // driver.findElement(By.xpath("//a[text()=\"Assignments\"]")).click();
        
        //open note page using xpath--text function
       // driver.findElement(By.xpath("//a[text()=\"Notes\"]")).click();
        
        //open notes page using xpath--contains function
        //driver.findElement(By.xpath("//a[contains(text(),\"Notes\")]")).click();
        
      //open assignment page using xpath--contains function
       // driver.findElement(By.xpath("//a[contains(text(),\"Assignments\")]")).click();
        
        
        //open assignment page using xpath--starts-with function
        //driver.findElement(By.xpath("//a[starts-with(text(),\"Ass\")]")).click();
        
        //open notes page using xpath--starts-with function
        //driver.findElement(By.xpath("//a[starts-with(text(),\"No\")]")).click();
        
        //open assignment page using cssSelector id
        //driver.findElement(By.cssSelector("#menu-item-354")).click();
        
        //open notes page using cssSelector id
       // driver.findElement(By.cssSelector("#menu-item-355")).click();
        
      //open assignment page using cssSelector class
       driver.findElement(By.cssSelector(".menu-item-354")).click();
        
        //open notes page using cssSelector class
        //driver.findElement(By.cssSelector(".menu-item-355")).click();
        
        
        
        
        //driver.quit();
	}

}
