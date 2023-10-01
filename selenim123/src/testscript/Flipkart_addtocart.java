package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_addtocart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		driver.findElement(By.linkText("Appliances")).click();	
	
       WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"));
       Actions a=new Actions(driver);
       a.moveToElement(ele).perform();
       driver.findElement(By.xpath("//a[@title='Fully Automatic Top Load']")).click();
       
       WebElement ele2 = driver.findElement(By.xpath("//div[text()='Haier 6.5 kg 5 Star Oceanus Wave Drum Washing Machine Fully Automatic Top Load Brown, Grey']"));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView();", ele2);
       driver.findElement(By.xpath("//div[text()='IFB 11 kg Power Dual Steam, Inbuilt Heater 4 years Comprehensive Warranty? Fully Automatic Top Load Wa...']")).click();
       driver.findElement(By.xpath("//button[contains(text(),' ')]")).click();
		
		
		
		
	}
	
	
	

}
