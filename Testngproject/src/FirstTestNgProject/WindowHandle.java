package FirstTestNgProject;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class WindowHandle {
	public static void windowhandler() {
	WebDriverManager.firefoxdriver().setup();
	RemoteWebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	//button[@id='tab
	Set<String> WinHandles=driver.getWindowHandles();
	for(String CurrentH:WinHandles) 
	{
		driver.switchTo().window(CurrentH);
		try {
if(driver.findElement(By.id("sampleHeading")).getText().contains("sample page"));
		  break;
		//tp-yt-paper-button[@class='style-scope ytd-subscribe-button-renderer']
		}
		catch(Exception e){
			System.out.println(e);
		}

}
	WebElement text=driver.findElement(By.id("sampleHeading"));
	System.out.println("Element found using text: "+text.getText());
	}}
