package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Filedownloadrobotclass {
	
	

		public static void main(String[] args) throws InterruptedException, AWTException
			{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
			Thread.sleep(2000);
		    Actions a = new Actions(driver);
			a.contextClick(ele).perform();
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_TAB);
			

			

		


	}


}
