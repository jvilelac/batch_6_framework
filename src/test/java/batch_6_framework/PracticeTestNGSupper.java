package batch_6_framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class PracticeTestNGSupper {

	
	@BeforeSuite
	public void before() {
		System.out.println("This is before");
	}
	
	@AfterSuite
	public void after() {
		System.out.println("This is after \n\n");
	}
	
	
}
