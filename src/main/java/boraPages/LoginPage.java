package boraPages;

import boratech_locators.LoginPage_Locators;
import projectData.BoraTech_TestData;
import utilityLibrary.BasePage;

public class LoginPage extends BasePage{
	
	
	public void login(String userName, String password) {
		lib.fillTextBox(LoginPage_Locators.userName, userName);
		lib.fillTextBox(LoginPage_Locators.password, password);

		lib.clickElement(LoginPage_Locators.loginButton);
	}

}
