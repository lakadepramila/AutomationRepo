package fileHandaling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteinExcel {

	public static void main(String[] args) throws IOException {
		String filepath=System.getProperty("user.dir")+"\\src\\fileHandaling\\TestData.xls";
		System.out.println(filepath);
		FileInputStream file= new FileInputStream(filepath);
		
		HSSFWorkbook ws=new HSSFWorkbook(file);
		
		//work sheet
		HSSFSheet sheet =ws.getSheet("Sheet1");
	
		//sheet row
		HSSFRow row =sheet.getRow(0);
		
		//sheet cell
		HSSFCell cell=row.getCell(0);
		
		cell.setCellValue("Username");//cell.setCellValue("Pramila");//put value in particular cell
		
		FileOutputStream file2= new FileOutputStream(filepath);
		ws.write(file2);
		
	}

}

