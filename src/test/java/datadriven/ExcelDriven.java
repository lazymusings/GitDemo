package datadriven;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;



public class ExcelDriven {
	@Test
	public void addBook() throws Exception
	{
		//COVERTING HASHMAP TO JSON AND DRIVING DATA FROM EXCEL
		DataDriven dd=new DataDriven();
		ArrayList<String> al=dd.getData("RestAddBook","sample");
		HashMap<String,Object> hm=new HashMap<String,Object>();
		hm.put("name", al.get(1));
		hm.put("isbn", al.get(2));
		hm.put("aisle", al.get(3));
		hm.put("author", al.get(4));
		/*HashMap<String,Object> hm2=new HashMap<String,Object>();
		hm2.put("lat", "12");
		hm2.put("lng", "42");
		hm.put("location", hm2);   //nested hashmap for arrays  */
RestAssured.baseURI="http://216.10.245.166";
String response=given().log().all().header("Content-Type", "application/json")
.body(hm)
.when().post("Library/Addbook.php")
.then().log().all().assertThat().statusCode(200).extract().response().asString();
JsonPath js=new JsonPath(response);
String id=js.get("ID");
System.out.println(id);
}
}
