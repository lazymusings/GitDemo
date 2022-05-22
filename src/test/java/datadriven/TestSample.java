package datadriven;

import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
DataDriven dd=new DataDriven();
ArrayList al=dd.getData("Purchase","testdata");
int size=al.size();
for(int i=0;i<size;i++)
{
System.out.println(al.get(i));
}
	}

}
