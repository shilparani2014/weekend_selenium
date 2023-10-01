package testscript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroswerLaunch {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver ch = new ChromeDriver();
		Thread.sleep(5000);
		ch.close();
	}

}
