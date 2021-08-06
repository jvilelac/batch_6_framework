package boraPages;

import boratech_locators.ExpirencePage_Locators;
import projectData.BoraTech_TestData;
import utilityLibrary.BasePage;

public class ExpirencePage extends BasePage {

	public void addExpirence() {
		lib.fillTextBox(ExpirencePage_Locators.jobTtile, BoraTech_TestData.experience_jobTitle);

		lib.fillTextBox(ExpirencePage_Locators.company, BoraTech_TestData.experience_company);

		lib.fillTextBox(ExpirencePage_Locators.location, BoraTech_TestData.experience_location);

		lib.fillTextBox(ExpirencePage_Locators.fromDate, BoraTech_TestData.experience_fromDate);

		lib.fillTextBox(ExpirencePage_Locators.toDate, BoraTech_TestData.experience_toDate);

		lib.fillTextBox(ExpirencePage_Locators.jobDescription, BoraTech_TestData.experience_jobDescription);

		lib.clickElement(ExpirencePage_Locators.submitButton);
	}

}
