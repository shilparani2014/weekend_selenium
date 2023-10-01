package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Rough {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*   driver.get("file:///C:/Users/Nagraj/Desktop/form2.html");
		WebElement ele = driver.findElement(By.id("a1"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		WebElement ele1 = driver.findElement(By.linkText("google"));
		System.out.println(ele1.getText());          
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.name("login"));
		Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		//fetch height and width
		Dimension size = ele.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getHeight());
		
		
		
		//Fetch all the links 
		
		driver.get("https://www.amazon.in");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		for (WebElement links : ele)
		{
			System.out.println(links.getText());
		}
		driver.close();
		
		//check and uncheck all checkbox 
		driver.get("file:///C:/Users/Nagraj/Desktop/checkbox.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement x : ele) 
		{
			x.click();
		}
		int size = ele.size();
		for (int i = size-1; i > 0; i--) 
		{
			ele.get(i).click();
		}
		System.out.println("checked and unchecked");
		
		driver.get("file:///C:/Users/Nagraj/Desktop/diabled.html");	
		Thread.sleep(2000);
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("documents.getElementByid('a1').value('5000')");
		Thread.sleep(2000);
		jsc.executeScript("documents.getElementByid('a3').value('')");
		//scroll actions
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for (int i = 0; i < 3; i++)
		{
			Thread.sleep(2000);
			js.executeScript("window,scrollBy(0,500)", "");	
		}
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.linkText("About Us"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", ele);
		 driver.get("https://www.amazon.in");
		 TakesScreenshot tsc = (TakesScreenshot)driver;
		 File temp = tsc.getScreenshotAs(OutputType.FILE);
		 File per = new File("./Photos/amazon.png");
		 FileHandler.copy(temp, per);
		driver.get("https://www.amazon.in");
		WebElement ele = driver.findElement(By.linkText("Mobiles"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();*/
		driver.get("file:///C:/Users/Nagraj/Desktop/selectsingle1.html");
		WebElement ele = driver.findElement(By.id("hotel"));
		Select s=new Select(ele);
		List<WebElement> all_opt = s.getOptions();
		ArrayList<String> l = new ArrayList<String>();
		for (WebElement o : all_opt) 
		{
			l.add((o.getText()));
		}
		Collections.sort(l);
		for (String sopt : l) 
		{
			System.out.println(sopt);
		}
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
	


