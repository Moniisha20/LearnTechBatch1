package TestNG_DEmo;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws Exception {
	 String flocation = "./TestData/Test.xlsx";

		XSSFWorkbook wbook = new XSSFWorkbook(flocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		for (int i = 0; i <=3; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <= 3; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}

		
//		for (int i = 0; i <=3 ; i++) {
//			XSSFRow row = sheet.getRow(i);
//			for (int j = 0; j <=3; j++) {
//				XSSFCell cell = row.getCell(j);
//				String value = cell.getStringCellValue();
//				System.out.println(value);
//}			} 
		
		
	
	
}
}
