package testscript;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollaction {//unable to scroll till find particular element rework on this

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.get("https://www.worldometers.info/geography/flags-of-the-world");
	/*for(int i=1;i<=3;i++)
	{
		js.executeScript("window.scrollBy(0,500)","");
	}*/
	WebElement ele = driver.findElement(By.xpath("//div[text()='Uganda']"));
	Thread.sleep(2000);
js.executeScript("arguments[0].scrollIntoView();", ele);
	}

}
