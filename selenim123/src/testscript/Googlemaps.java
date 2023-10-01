package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Googlemaps {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("searchboxinput")).sendKeys("Orian mall");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[.='Directions']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Mathikere bus stand");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement ele = driver.findElement(By.xpath("//h1[.='via 1st Main Rd/B Narayanaswamappa Rd']"));
		//JavascriptExecutor jsc=(JavascriptExecutor)driver;
		//jsc.executeScript("arguments[0].scrollIntoView();", ele);
		/*WebElement ele1 = driver.findElement(By.xpath("//div[.=' ']"));
		Select s=new Select(ele1);
		List<WebElement> options = s.getOptions();
		for (WebElement o : options)
		{
			System.out.println(o.getText());
		}*/
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(p_id);
		for (String o : all_id) 
		{
			driver.switchTo().window(o);
			
		}
		
		

	}

}
