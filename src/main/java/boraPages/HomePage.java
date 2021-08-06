package boraPages;

import boratech_locators.HomePage_Locators;
import utilityLibrary.BasePage;

public class HomePage extends BasePage{

	
	public void clickOnLoginButton() {
		lib.clickElement(HomePage_Locators.loginButton);
	}
	
	
	
}
