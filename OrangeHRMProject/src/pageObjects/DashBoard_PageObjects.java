package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_PageObjects {
	
	@FindBy(xpath="//td[contains(text(), 'No Records are Available')]")
	public static WebElement dashBoard;

}
