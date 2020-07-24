package com.avegaInterview.libraries;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadLoginCredentials {

	XSSFWorkbook workbook;

	public ReadLoginCredentials(String excelFileLocation) throws Exception {

		File excelFilePath = new File(excelFileLocation);
		try {
			FileInputStream fis = new FileInputStream(excelFilePath);
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				this.workbook = workbook;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String readExcelData(String workBookSheetName, int rowNumber, int columnNumber) {
		XSSFSheet workBookSheet = workbook.getSheet(workBookSheetName);
		// String cellValue =
		// workBookSheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();

		DataFormatter formatter = new DataFormatter();
		String cellValue = formatter.formatCellValue(workBookSheet.getRow(rowNumber).getCell(columnNumber));
		return cellValue;
	}

}
