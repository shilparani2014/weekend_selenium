package testscript;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_FirefoxBrowserLaunch {
		public static void main(String[] args) {
			String key="webdriver.chrome.driver";
			String value="./softwares/chromedriver.exe";
			System.setProperty(key, value);
			ChromeDriver ch = new ChromeDriver();
			String key1="webdriver.gecko.driver";
			String value1="./softwares/geckodriver.exe";
			System.setProperty(key1, value1);
			FirefoxDriver fx = new FirefoxDriver();
		}

	}

