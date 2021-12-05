package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PageObjects {
	
	@FindBy(xpath="//input[@id='txtUsername']")
	public static WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public static WebElement passWord;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public static WebElement loginBtn;

}
