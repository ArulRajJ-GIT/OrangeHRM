package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagagement_PageObjects {

	@FindBy(xpath="(//*[contains(text(), 'Admin')])[1]")
	public static WebElement admin;
	
	@FindBy(xpath="//a[contains(text(), 'User Management')]")
	public static WebElement userManagement;
	
	@FindBy(xpath="//a[contains(text(), 'Users')]")
	public static WebElement user;
	
	@FindBy(xpath="//select[@id='searchSystemUser_userType']")
	public static WebElement userRole;
	
	@FindBy(xpath="//select[@id='searchSystemUser_status']")
	public static WebElement status;
	
	@FindBy(xpath="//select[@id='searchBtn']")
	public static WebElement search;
	
	@FindBy(xpath="(//td[contains(text(), 'Admin')])[1]")
	public static WebElement getAdminTxt;
	
	@FindBy(xpath="(//td[contains(text(), 'Enabled')])[1]")
	public static WebElement getStatusTxt;
	
}
