package TestNG_DEmo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcheck{

	public static String[][] readData() 
	{
		
		String[][] data = null ;
		try {
			String destfile = "./TestData/Test.xlsx";

			FileInputStream fs = new FileInputStream(destfile);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheetAt(0);
			System.out.println("Value");
			//get the no.of. rows
			int rcount = sheet.getLastRowNum();
			//get no.of.columns
			int ccount = sheet.getRow(0).getLastCellNum();
			int tnofrows = sheet.getPhysicalNumberOfRows();
			data = new String[rcount][ccount];
			//loop through rows
			for(int i = 1; i<rcount+1 ; i++)
			{
				try
				{
					XSSFRow row = sheet.getRow(i);
					for(int j =0 ; j < ccount; j++)
					{
						XSSFCell cell = row.getCell(j);
						DataFormatter dft = new DataFormatter();
						try
						{
							String cellvalue = "";
							try {
								cellvalue = dft.formatCellValue(cell);
								data[i-1][j] = cellvalue ;
								System.out.println(data[i-1][j] );
							}
							catch(NullPointerException e)
							{
								System.out.println("VAlue is empty");
							}
							//add to the data array
						} catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			fs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return data ;
	}
	
	public void setCellData(String dataSheetName , String TestDataPath, String cellValue, String rowName , String colName)
	{
		try
		{
			FileInputStream fs = new FileInputStream(TestDataPath+dataSheetName+".xslx");
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheetAt(0);
			//get the no.of. rows
			int rcount = sheet.getLastRowNum();
			//get no.of.columns
			int ccount = sheet.getRow(0).getLastCellNum();
			

			
			int rnum = 0;
			int cnum = 0;
			Row row = sheet.getRow(0);
			
			for(int i = 1 ; i < rcount+1 ; i++)
			{
				Row rowLoop = sheet.getRow(i);
				Cell c = rowLoop.getCell(0);
				
				String testcaserowname = c.getStringCellValue();
				if(rowName.equalsIgnoreCase(testcaserowname))
				{
					rnum= i ;
					break ;
				}
			}
		
			for(int j = 0 ; j < ccount ; j++)
			{
				Cell c = row.getCell(j);
				String testcasecellname = c.getStringCellValue();
				if(colName.equalsIgnoreCase(testcasecellname))
				{
					cnum = j ;
					break;
				}
			}
			Cell cellwrite = sheet.getRow(rnum).getCell(cnum);
			if(cellwrite == null)
			{
				cellwrite = sheet.getRow(rnum).getCell(cnum);
				cellwrite.setCellValue(cellValue);
			}
			else
			{
				cellwrite.setCellValue(cellValue);
			}
			FileOutputStream fileout = new FileOutputStream(TestDataPath+dataSheetName+".xslx");
			wb.write(fileout);
			fileout.close();
		}
			catch(Exception e)
		{
				e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		Excelcheck ec = new Excelcheck();
ec.readData();	}
}
