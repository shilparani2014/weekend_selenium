package testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopup 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
	a.accept();
	
	
	

	}

}
