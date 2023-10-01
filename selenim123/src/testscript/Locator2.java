package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shilparani");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}




}
