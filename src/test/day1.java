package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	//TEST METHODS IN A CLASS ARE EXECUTED IN ALPHABETICAL ORDER
    
	
	@Test(groups={"smoke"})
	public void demo1() {
		System.out.println("Hello");
	}

	//TESTLEVEL PARAMETER
	@Parameters({"URL","APIKey"})
	@Test
	public void demo2(String url,String apiKey) {
		System.out.println("Bye");
		System.out.println(url);
		System.out.println(apiKey);
	}

	// SET AT TESTNG.XML TEST LEVEL: AFTERTEST IS USED TO DELETE COOCKIES, STOP
	// PROCESS.CLOSE CONNECTIONS POST EXECUTION
	@AfterTest
	public void demo3() {
		System.out.println("I will execute at last");
	}

	// SET AT TESTNG.XML LEVEL:AFTERSUITE
	@AfterSuite
	public void demo4() {
		System.out.println("I am no. 1 from last");
	}

}
