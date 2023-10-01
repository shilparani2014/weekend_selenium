package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemap {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//button[@aria-label='Directions']"));
			ele.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...]'")).sendKeys("Hubli");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
			

		}

	}



