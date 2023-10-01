package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue")).click();
		Thread.sleep(2000);
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		all_id.remove(p_id);
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		for (String s : all_id)
		{
		Thread.sleep(2000);
		driver.switchTo().window(s);
		WebElement ele1 = driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']"));
		Thread.sleep(2000);
	     jsc.executeScript("arguments[0].scrollIntoView();", ele1);
	     driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		}	
		
	}

}



































































