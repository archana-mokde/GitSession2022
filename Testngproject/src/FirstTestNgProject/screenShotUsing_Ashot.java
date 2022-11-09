package FirstTestNgProject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class screenShotUsing_Ashot {
@Test
	public static void screenShotUsing_AshotExample() throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://testingshastra.com");
		driver.manage().window().maximize();
		
		AShot ashot=new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		Screenshot sc=ashot.takeScreenshot(driver);
		BufferedImage img=sc.getImage();
		ImageIO.write(img, "jpeg", new File("UsingAshot"));
		
		
		
	}
}
