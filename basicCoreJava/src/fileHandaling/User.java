package fileHandaling;

import java.io.IOException;

public class User {
	
	public static void main(String[] args) throws IOException {
		
	String filepath=System.getProperty("user.dir")+"\\src\\fileHandaling\\TestData.xls";
	
	Xls_Reader xl= new Xls_Reader(filepath);
	System.out.println(xl.getColumnCount("Sheet1"));
	System.out.println(xl.getRowCount("Sheet1"));
	int rows=xl.getRowCount("Sheet1");
	int cols=xl.getColumnCount("Sheet1");

	
 //System.out.println(xl.getCellData("Sheet1", 1, 1));
	
	//xl.setCellData("Sheet1", 2, 1, "Priyanka");
	//System.out.println(xl.getCellData("Sheet1", 2, 1));
	
	for(int r=1;r<rows;r++)
	{
		for (int c=1;c<=cols;c++){
			System.out.print(xl.getCellData("Sheet1", r, c)+" ");
		}
		System.out.println();
	}

	
	}

}
