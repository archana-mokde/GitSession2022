package FirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandalAlert_Example {
	public static void AcceptAlert() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingshastra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()=\"Assignments\"]")).click();
		driver.findElement(By.xpath("//a[text()=\" simple alert\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"alert-btn\"]")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//this is handle ok
		driver.close();
	}
	public static void AcceptAndDismiss() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingshastra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()=\"Assignments\"]")).click();
		driver.findElement(By.xpath("//a[text()=\" prompt alert\"]")).click();
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Archana");
		alert.accept();
		alert.sendKeys("30");
		Thread.sleep(3000);
		alert.accept();
		String WindowText=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(WindowText);
		driver.close();
	}
	public static void dissmissAlert() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\java_workspace\\FirstSeleniumProject\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingshastra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()=\"Assignments\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"confirmation alert\"]")).click();
		driver.findElement(By.xpath("//button[@class='alert-btn']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		//String WindowText=driver.findElement(By.xpath("//button[text()=\"Click Me\"]")).getText();
		//System.out.println(WindowText);
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		//AcceptAlert();
		AcceptAndDismiss();
		//dissmissAlert();
		
		
		
		
		
	}

}
