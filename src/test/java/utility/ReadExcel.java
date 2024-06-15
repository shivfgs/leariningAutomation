package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//index
//		XSSFSheet mySheet = workbook.getSheetAt(0);		
		
		
		//SheetName
//		XSSFSheet mySheet = workbook.getSheet("smokeTest");
		XSSFSheet mySheet = workbook.getSheet("Student");
		
		
		
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
