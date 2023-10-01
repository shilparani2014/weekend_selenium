package testscript;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Settolistass 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Nagraj/Desktop/selectsingle1.html");
	WebElement ele = driver.findElement(By.id("hotel"));
	TreeSet<String> t1 = new TreeSet<String>();
	Select s = new Select(ele);
	List<WebElement> opt = s.getOptions();
	for(WebElement o:opt)
	{
		String text=o.getText();
		t1.add(text);
	}
	ArrayList<String> l = new ArrayList<String>(t1);
	
	for(String x:l)
	{
		System.out.println(x);
	}
	}
}
