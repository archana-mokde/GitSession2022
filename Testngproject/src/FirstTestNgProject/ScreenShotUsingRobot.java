package FirstTestNgProject;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class ScreenShotUsingRobot {
  public static void screenshotusingRobot() throws AWTException, IOException 
  {
	  WebDriverManager.firefoxdriver().setup();
	  RemoteWebDriver driver=new FirefoxDriver();
	  driver.get("https://testingshastra.com");
	  driver.manage().window().maximize();
	  Robot robo=new Robot();
	  Rectangle rect=new Rectangle();
	  rect.setSize(1920,1080);
	  BufferedImage img=robo.createScreenCapture(rect);
	  File outputfile=new File("image.jpeg");
	  ImageIO.write(img, "jpeg", outputfile);
	  
  } 
  
}
