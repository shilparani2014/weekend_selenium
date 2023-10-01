package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.get("https://www.amazon.in/");
     driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone14");
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61cwywLZR-L._AC_UY218_.jpg\']")).click();
    
    
    
    
    String p_id=driver.getWindowHandle();
    Set<String> all_id=driver.getWindowHandles();
    all_id.remove(p_id);
    
   
    for (String id : all_id)
    {
	Thread.sleep(2000);
	driver.switchTo().window(id);
	WebElement ele = driver.findElement(By.id("submit.add-to-cart-announce"));
	Thread.sleep(2000);
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].ScrollIntoView();",ele);
	ele.click();
	}
    WebDriverWait wait=new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.titleContains("Amazon"));
    System.out.println(driver.getTitle());
    
	
	
    
    
    
	}

}
