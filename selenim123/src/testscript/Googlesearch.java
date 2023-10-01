package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/search?client=firefox-b-d&q=qspiders");
		List<WebElement> eles = driver.findElements(By.xpath("//a"));
		for(WebElement ele: eles)
		{
			String text=ele.getText();
			System.out.println(text);
		}
		System.out.println(eles.size());
	}

}
