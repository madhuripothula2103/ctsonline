package cts.miniproject.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Exceldataconfig(String excelpath)
	{
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
	 wb=new XSSFWorkbook(fis);
	sheet1=wb.getSheetAt(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
	System.out.println(e.getMessage());
		} 
	}
	public String getData(int sheetNumber,int row,int column) {
		sheet1=wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;

}
	public int getRowCount(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
