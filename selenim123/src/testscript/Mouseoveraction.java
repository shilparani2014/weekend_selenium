package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction 
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='✕']")).click();
	WebElement ele= driver.findElement(By.xpath("//span[.='Fashion'])[1]"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
	
	
	
			}
	
	
	
	
	
	
}
