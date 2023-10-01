package testscript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Nagraj/Desktop/selectsingle1.html");
       TreeSet<String> ts=new TreeSet<String> (Collections.reverseOrder());;
      
        WebElement ele = driver.findElement(By.id("hotel"));
        Select s=new Select(ele);
        List<WebElement> all_opt = s.getOptions();
        for (WebElement o : all_opt) 
        {
			ts.add(o.getText());
		}
        for (String x : ts) 
        {
			System.out.println(x);
		}
        
      
        
		
		
	}

}
