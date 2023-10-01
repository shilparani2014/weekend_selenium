package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Printalloptionfromdrpdwn
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Nagraj/Desktop/selectsingle1.html");
	WebElement ele = driver.findElement(By.id("hotel"));
	Select s = new Select(ele);
	List<WebElement> opt = s.getOptions();
	for(WebElement o:opt)
	{
		System.out.println(o.getText());
	}
	
}
}
