package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Botharchievertp 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
Thread.sleep(2000);
driver.close();
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver1=new ChromeDriver();
Thread.sleep(2000);
driver.quit();
}
}

