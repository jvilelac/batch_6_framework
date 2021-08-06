package boraPages;

import boratech_locators.Dashboard_Locators;
import utilityLibrary.BasePage;

public class Dashboard extends BasePage{
	
	
	
	public void clickAddExpirenceButton() {
		lib.clickElement(Dashboard_Locators.addExperienceButton);
	}
	
	public void clickAddEducation() {
		lib.clickElement(Dashboard_Locators.addEducationButton);
	}

}
