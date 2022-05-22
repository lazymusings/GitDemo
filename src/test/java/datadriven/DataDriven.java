package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	ArrayList<String> a=new ArrayList<String>();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

	}
	
	public ArrayList<String> getData(String testCaseName, String sheetName) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\SELENIUM ARTIFACTS\\demodata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			
			if(workbook.getSheetName(i).equalsIgnoreCase(sheetName))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.rowIterator();
				Row firstRow=rows.next();
				Iterator<Cell> cells=firstRow.cellIterator();
				int k=0;
				int column=0;
				while(cells.hasNext())
				{
					if(cells.next().getStringCellValue().equalsIgnoreCase("Test Case"))
					{
						column=k;
					}
				k++;
				}
				System.out.println(column);
				
				while(rows.hasNext())
				{
					Row  r=rows.next();
					Cell c=r.getCell(column);
					if(c.getStringCellValue().equalsIgnoreCase(testCaseName))
		{
			Iterator<Cell> cell= r.cellIterator();
			while(cell.hasNext())
			{
				Cell ce=cell.next();
				if(ce.getCellType()==CellType.STRING)
				a.add(ce.getStringCellValue());
				else
					a.add(NumberToTextConverter.toText(ce.getNumericCellValue()));
			}
		} 
				}
				
			}
		}
		return a;
	}
	
}
