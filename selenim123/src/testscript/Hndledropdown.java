package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hndledropdown 
{
	
				public static void main(String[] args) throws InterruptedException
				{
					
					System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
					WebDriver driver=new FirefoxDriver();
					driver.get("file:///C:/Users/Nagraj/Desktop/selectsingle1.html");
					Thread.sleep(2000);
					WebElement ele= driver.findElement(By.id("hotel"));
					Select a=new Select(ele);
					a.selectByIndex(3);
					Thread.sleep(2000);
					a.selectByValue("m");
					Thread.sleep(2000);
					a.selectByVisibleText("BBB");
					Thread.sleep(2000);
					a.deselectAll();
					
					

		


		


	}

}
