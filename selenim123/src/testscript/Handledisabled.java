package testscript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handledisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor jsc= (JavascriptExecutor)driver;
		driver.get("file:///C:/Users/Nagraj/Desktop/diabled.html");
		Thread.sleep(2000);
		jsc.executeScript("Document.getElemetById('a1').value='6000'");
		jsc.executeScript("Document.getElementById('a3').value=''");
		
	}

}
