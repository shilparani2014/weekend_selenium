package pom_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom

{
@FindBy(id="email")
private WebElement email_id;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement login;
public Pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void email_id()
{
	email_id.sendKeys("abc");
	password.sendKeys("123");
	login.click();
}


}
