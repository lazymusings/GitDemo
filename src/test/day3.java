package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	//Testlevel parameter
    @Parameters({"URL1"})
	@Test
	public void webLoginCarLoan(String url)
	{
		System.out.println("webLoginCarLoan");
		System.out.println(url);
	}	
	
	@Test(groups={"smoke"})
	public void mobileLoginCarLoan()
	{
		System.out.println("mobileLoginCarLoan");
	}	
	
	@Test
	public void mobileLogoutCarLoan()
	{
		System.out.println("mobileLogoutCarLoan");
	}	
	
	//TO EXECUTE A METHOD BEFORE EXECUTING ANOTHER METHOD EVEN THOUGH THE 2ND ONE COMES FIRST IN ALPHABETICAL ORDER
	@Test(dependsOnMethods={"webLoginCarLoan","mobileLogoutCarLoan"})
	public void apiLoginCarLoan()
	{
		System.out.println("apiLoginCarLoan");
	}	
}
