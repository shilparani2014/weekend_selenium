package testscript;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver fx = new FirefoxDriver();
		Thread.sleep(2000);
	}

}
