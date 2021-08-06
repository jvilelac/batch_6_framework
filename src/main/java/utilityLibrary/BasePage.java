package utilityLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import boraPages.Dashboard;
import boraPages.EducationPage;
import boraPages.ExpirencePage;
import boraPages.HomePage;
import boraPages.LoginPage;

public class BasePage {

	static WebDriver driver;
	public static SeleniumFunctionalMethod lib;
	
	public static HomePage home = new HomePage();
	public static LoginPage login = new LoginPage();
	public static Dashboard dashboard = new Dashboard();
	public static ExpirencePage expirence = new ExpirencePage();
	public static EducationPage edu = new EducationPage();
	
	@BeforeMethod
	public static void startTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

		driver = new ChromeDriver();
		String url = "https://boratech.herokuapp.com/";

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		lib = new SeleniumFunctionalMethod(driver);

		lib.openUrl(url);
	}

	@AfterMethod
	public static void endTest() {
		waitFor(4);
		driver.close();
		driver.quit();
	}
	
	
	public static void waitFor(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
	
}
