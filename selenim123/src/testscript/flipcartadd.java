package testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class flipcartadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		     WebDriver driver = new FirefoxDriver();
		     driver.get("https://www.flipkart.com/");
		     driver.findElement(By.xpath("//button[text()='✕']")).click();
		     driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more\']")).sendKeys("iphone14");
driver.findElement(By.xpath("//path[@d='m6.486 10.901c-2.42 0-4.381-1.956-4.381-4.368 0-2.413 1.961-4.369 4.381-4.369 2.42 0 4.381 1.956 4.381 4.369 0 2.413-1.961 4.368-4.381 4.368m0-10.835c-3.582 0-6.486 2.895-6.486 6.467 0 3.572 2.904 6.467 6.486 6.467 3.582 0 6.486-2.895 6.486-6.467 0-3.572-2.904-6.467-6.486-6.467\']")).click();		    

	}

}
