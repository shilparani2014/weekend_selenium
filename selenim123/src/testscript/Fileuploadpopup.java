package testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nagraj/Desktop/file.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("f1"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\Nagraj\\Desktop\\shopperstaack.json");
		
		
		

		

	}


}
