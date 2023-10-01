package testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.youtube.com/");
	 driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("shilparani");
			

		}




	}

	
	
	
	
	
	

