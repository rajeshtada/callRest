package com.example.callRest;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class SbiClaimFileXls {

	public static void main(String[] args) {
		
		SbiClaimFileXls.testSbiClaimFile();
	}
	
	public static void testSbiClaimFile() {
		String basePath = "/media/shared/donotdelete/settlement-test/";
		File baseFolderObj = new File(basePath);
		baseFolderObj.mkdirs();
		String fileName = "SBI_NB_Claim_File" + ".xlsx";

		String file = basePath + /* File.separator */"/" + fileName;

		try (XSSFWorkbook myWorkBook = new XSSFWorkbook()) {
			XSSFSheet sbisheet1 = myWorkBook.createSheet("sheet");

			Font newFont = sbisheet1.getWorkbook().createFont();
			newFont.setBold(true);
			newFont.setFontHeightInPoints((short) 16);
			newFont.setItalic(false);

			CellStyle cellStyle = sbisheet1.getWorkbook().createCellStyle();
			cellStyle.setFont(newFont);

			int rowc = 0;
			int col = 0;
			XSSFRow row = sbisheet1.createRow(rowc);
			col = 0;
			Cell cell = row.createCell(col);
			cell.setCellValue("State Bank of India");
			CellUtil.setFont(cell, newFont);
			col++;
			cell = row.createCell(col);
			cell.setCellValue("");
			col++;
			cell = row.createCell(col);
			cell.setCellValue("08/08/2024");
			col++;
			cell = row.createCell(col);
			cell.setCellValue("");

			sbisheet1.addMergedRegion(new CellRangeAddress(rowc, rowc, 0, 1));
			sbisheet1.addMergedRegion(new CellRangeAddress(rowc, rowc, 2, 3));

			FileOutputStream os = new FileOutputStream(file);
			myWorkBook.write(os);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("File writing Done = "+file);
	}
}
