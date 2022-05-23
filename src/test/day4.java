package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	//IF THERE IS SOME ERROR IN SUITE AND WE DON'T WANT TO EXECUTE RELATED TESTCASE
	@Test(enabled=false)
	public void webLoginHomeLoan()
	{
		System.out.println("webLoginHomeLoan");
	}	
	
	//TO SET SOME TIMEOUT: IN CASE A SERVICE IS TAKING MORE TIME THAN SET IN IMPLICIT WAIT, IT WILL WAIT FOR SET TIME BEFORE FAILING
	@Test(timeOut=3000)
	public void mobileLoginHomeLoan()
	{
		System.out.println("mobileLoginHomeLoan");
	}	
	
	//Parameter: to set url
	@Parameters({"URL"})
	@Test
	public void apiLoginHomeLoan(String url)
	{
		System.out.println("apiLoginHomeLoan");
		System.out.println(url);
	}	
	
	//USING DATAPROVIDER
	@Test(dataProvider="demo2")
	public void apiLogoutHomeLoan(String user, String pass)
	{
		System.out.println("apiLogoutHomeLoan");
		System.out.println(user);
		System.out.println(pass);
	}	
	
	//SET AT TESTNG.XML LEVEL: USED  TO SET ENVIRONMENT VARIABLES, SENDING KEYS IN CASE OF APIS
	@BeforeSuite
	public void demo1()
	{
		System.out.println("I am no. 1");
	}
	
	//DATAPROVIDER:USED TO PARAMETERIZE AT TEST CASE LEVEL:TO EXECUTE TEST CASE WITH DIFFERENT DATA SETS
	@DataProvider
	public Object[][] demo2()
	{
		Object[][] data=new Object[3][2];
		data[0][0]= "user1";
		data[0][1]= "pass1";
		
		data[1][0]= "user2";
		data[1][1]= "pass2";
		
		data[2][0]= "user3";
		data[2][1]= "pass3";
		
		return data;
	}
}
