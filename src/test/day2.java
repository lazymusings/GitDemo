package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups={"smoke"})
	public void demo1() {
		System.out.println("good");
	}

	// SET AT TESTNG.XML TEST LEVEL:BEFORETEST WILL BE USED TO CLEAR OLD DATA,
	// EXECUTE SOME PRE-REQUISITE CONDITIONY, TO SET BASE URL FOR REST API
	@BeforeTest
	public void demo2() {
		System.out.println("I will execute first");
	}

	// BEFOREMETHOD IS SET AT CLASS LEVEL: WILL BE EXECUTED BEFORE EXECUTING EACH
	// METHOD IN CLASS
	@BeforeMethod
	public void demo3() {
		System.out.println("Before Method");
	}

	// AFTERMETHOD IS SET AT CLASS LEVEL:WILL BE EXECUTED AFTER EXECUTING EACH
	// METHOD IN THE CLASS
	@AfterMethod
	public void demo4() {
		System.out.println("After Method");
	}

	// BEFORECLASS IS DEFINED AT CLASS LEVEL: EECUTED BEFORE EXECUTING ANY METHOD IN
	// THE CLASS INCLUDING BEFOREMETHOD
	@BeforeClass
	public void demo5() {
		System.out.println("Before Class");
	}

	// AFTERCLASS IS DEFINED AT CLASS LEVEL: EECUTED AFTER EXECUTING ALL METHOD IN
	// THE CLASS INCLUDING AFTERMETHOD
	@AfterClass
	public void demo6() {
		System.out.println("After Class");
	}
}
