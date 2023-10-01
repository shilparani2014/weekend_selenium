package pom_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://www.facebook.com");
	Pom p=new Pom (driver);
	p.email_id();
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	p.email_id();
	
	
			}
}
