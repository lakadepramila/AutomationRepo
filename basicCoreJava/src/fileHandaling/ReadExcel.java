package fileHandaling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;//parent of all exception

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	//	System.out.println(System.getProperty("user.dir"));//it will provide project path in your machine
		String filepath=System.getProperty("user.dir")+"\\src\\fileHandaling\\TestData.xls";
		System.out.println(filepath);
		FileInputStream file= new FileInputStream(filepath);
		
		HSSFWorkbook ws=new HSSFWorkbook(file);
		
		HSSFSheet sheet =ws.getSheet("Sheet1");
		
		HSSFRow row =sheet.getRow(2);
		
		HSSFCell cell=row.getCell(1);
		
		
		
		if(cell.getCellTypeEnum() == CellType.STRING){
			System.out.println(cell.getStringCellValue());
		}else if(cell.getCellTypeEnum() == CellType.NUMERIC)
		{
			int a=(int) cell.getNumericCellValue();
			System.out.println(a);
		}
		
		
		
	}

}
