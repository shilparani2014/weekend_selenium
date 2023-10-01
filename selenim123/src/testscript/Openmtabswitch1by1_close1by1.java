package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Openmtabswitch1by1_close1by1
{
public static void main(String[] args) throws InterruptedException, AWTException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev");
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
		
		
		
		
		ArrayList<WebElement> l = new ArrayList<WebElement>();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		Actions a = new Actions(driver);
		Robot r = new Robot();
		for (WebElement ele : l) 
		{
		a.contextClick().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		driver.close();
		
		
		}
		
		
}
}
