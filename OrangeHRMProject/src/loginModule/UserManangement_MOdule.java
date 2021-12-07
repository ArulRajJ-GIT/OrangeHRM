package loginModule;

import org.com.defaultBrowser.BrowseLauncher;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import pageObjects.UserManagagement_PageObjects;

public class UserManangement_MOdule extends BrowseLauncher {

	static Logger logger=Logger.getLogger(UserManangement_MOdule.class);
	
	
	public void userManagement() {

		PageFactory.initElements(driver, UserManagagement_PageObjects.class);

		UserManagagement_PageObjects.admin.click();
		UserManagagement_PageObjects.userManagement.click();
		UserManagagement_PageObjects.user.click();
		
	}

	
	public void searchUser() {
		
		PageFactory.initElements(driver, UserManagagement_PageObjects.class);
		
		Select select= new Select(UserManagagement_PageObjects.userRole);
		select.selectByIndex(0);
		
		Select select1= new Select(UserManagagement_PageObjects.status);
		select.selectByIndex(0);

		UserManagagement_PageObjects.search.click();
	}
	@Test
	public void getUserValue() {
		
		userManagement();
		searchUser();
		
		PageFactory.initElements(driver, UserManagagement_PageObjects.class);
		
		String text = UserManagagement_PageObjects.getAdminTxt.getText();
		logger.info(text);
		Assert.assertEquals(text, "Admin");

		String text1 = UserManagagement_PageObjects.getStatusTxt.getText();
		logger.info(text1);
		Assert.assertEquals(text1, "Admin");
	}

}
