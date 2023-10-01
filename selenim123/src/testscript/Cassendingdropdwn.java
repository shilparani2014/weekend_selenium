package testscript;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Cassendingdropdwn
{


	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nagraj/Desktop/selectsingle1.html");
		WebElement ele = driver.findElement(By.id("hotel"));
		ArrayList<String> l = new ArrayList<String>();
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		for(WebElement o:opt)
		{
			String text=o.getText();
			l.add(text);
		}
		TreeSet<String> t = new TreeSet<String>(l);
		for(String x:t)
		{
			System.out.println(x);
		}
		
	}
	

}
