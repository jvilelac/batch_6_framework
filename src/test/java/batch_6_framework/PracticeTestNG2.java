package batch_6_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeTestNG2 extends PracticeTestNGSupper{

	
	
	@Test
	public void test_1() {
		System.out.println("this is test 1");
	}
	@Test(priority = 0)
	public void test_2() {
		System.out.println("this is test 2");
	}
	@Test(priority = -5)
	public void test_3() {
		System.out.println("this is test 3");
	}
	
//	@BeforeClass
//	public void before() {
//		System.out.println("This is before");
//	}
//	
//	@AfterClass
//	public void after() {
//		System.out.println("This is after \n\n");
//	}
	
	
}
