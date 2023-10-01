package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmail {
	
 
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://accounts.google.com/v3/signin/identifier?elo=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&ifkv=AXo7B7UV0hzyO5o1lPj0KG9d_If093wkiHGxBMhgEcTjONyhQemMEQ0AA07xHOpFTlduaVkYXVcpMg&dsh=S-754601638%3A1692517010952999");
			driver.findElement(By.id("identifierId")).sendKeys("shilparani");
			Thread.sleep(2000);
			
			driver.findElement(By.className("\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"")).click();
		

	}

}
