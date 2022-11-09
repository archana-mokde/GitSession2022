package excelWorkBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readExcelFileData {

	
	public Object [][] loadSheet(String fileName,String sheetName) throws IOException{
		Object[][] obj=null;
		FileInputStream fis =new FileInputStream (fileName);
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet(sheetName);
		//Row row=sheet.getRow(1);
		int rows=sheet.getLastRowNum();
		obj=new Object[rows-1][sheet.getRow(0).getLastCellNum()-1];
		
		for(int i=1;i<=rows;i++)
		{
			Row row=sheet.getRow(i);
			 int  cells=row.getLastCellNum();
			 for(int j=1;j<=cells;j++) {
				 Cell cell=row.getCell(j);
				 obj[i-1][j-1]=cell.getStringCellValue();
			 }
			
				
			}
			
		
		
		
		return obj;
		}
	public static void main(String[]args) throws IOException {
		readExcelFileData obj=new readExcelFileData();
		obj.loadSheet("D:\\Java_Workspace1\\ExcelSheet\\Book1.xlsx", "Books");


	}
}
