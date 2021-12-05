package loginModule;

import java.util.Properties;

import org.com.defaultBrowser.BrowseLauncher;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import pageObjects.DashBoard_PageObjects;
import pageObjects.Login_PageObjects;

public class Login_Module extends BrowseLauncher {

	static Logger logger=Logger.getLogger(Login_PageObjects.class);

	public void login() {

		PageFactory.initElements(driver, Login_PageObjects.class);

		Login_PageObjects.userName.sendKeys(prop.getProperty("username"));
		Login_PageObjects.passWord.sendKeys(prop.getProperty("passWord"));
		Login_PageObjects.loginBtn.click();

	}

	public void dashBoard() {
		
		PageFactory.initElements(driver, DashBoard_PageObjects.class);

		String text = DashBoard_PageObjects.dashBoard.getText();
		logger.info(text);
		
		Assert.assertEquals(text, "No Leave Request");
	}

}
