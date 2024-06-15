package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls");
		
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		//index
//		XSSFSheet mySheet = workbook.getSheetAt(0);		
		
		
		//SheetName
//		HSSFSheet mySheet = workbook.getSheet("smokeTest");
		HSSFSheet mySheet = workbook.getSheet("Student");
		
		
		
		int columnCount = mySheet.getRow(0).getLastCellNum();
		
		
		int rowCount = mySheet.getLastRowNum();
		
		
		System.out.println("Rows Count: " + rowCount);
		System.out.println("Colums Count: " + columnCount);
		
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String fName = mySheet.getRow(i).getCell(0).toString();
			String address = mySheet.getRow(i).getCell(4).toString();
			
			System.out.println("----------------------------------------------------------");
			System.out.println("FirstName " + fName + " : address detailsare: " + address);
			
		}
		
		
		

	}

}
