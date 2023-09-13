package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

public class Flib {
	//Stores Generic reusable methods
	public String readExcelData(String Excelpath,String Sheetname,int Rowno,int cellno) throws EncryptedDocumentException, IOException
	{
		FileInputStream fil = new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fil);
		Sheet sheet = wb.getSheet(Sheetname);
		Row r = sheet.getRow(Rowno);
	    Cell c = r.getCell(cellno);
		String data = c.getStringCellValue();
		return data;
	}
	public String readPropertyData(String propath,String key) throws IOException 
	{
		FileInputStream fil = new FileInputStream(propath);
		Properties pro = new Properties();
		pro.load(fil);
		String data = pro.getProperty(key);
		return data;

    }
	public int rowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		    FileInputStream fil = new FileInputStream(excelpath);
	        Workbook wb = WorkbookFactory.create(fil);
	        Sheet sheet = wb.getSheet(sheetname);
	         int rowc = sheet.getLastRowNum();
	         return rowc;
		
	}
}
