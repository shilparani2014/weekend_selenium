package testng_Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sample extends Generic
{
@Test
public void test1()
{
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("abc");
	driver.findElement(By.id("pass")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();
	

}
}
