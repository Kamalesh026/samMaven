package org.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\MavenSamp\\src\\test\\java\\Excelsheet\\Book1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh=book.getSheet("sheet1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		
		
	}

	
		
	
	
	
}
