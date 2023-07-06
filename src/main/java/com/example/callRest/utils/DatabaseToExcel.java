package com.example.callRest.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseToExcel {

	public String generateExcel() {
		try (// Create a workbook
				XSSFWorkbook workbook = new XSSFWorkbook()) {
			// Create a spreadsheet inside a workbook
			XSSFSheet spreadsheet1 = workbook.createSheet("student db");
			XSSFRow row = spreadsheet1.createRow(0);
			XSSFCell cell;

			// Step 6: Process the results
			cell = row.createCell(0);
			cell.setCellValue("RollNo");

			cell = row.createCell(1);
			cell.setCellValue("Name");

//		        // i=2 as we will start writing from the 1'st row
//		        int i = 1;
//
//		        while (resultSet.next()) {
//		            row = spreadsheet1.createRow(i);
//		            cell = row.createCell(1);
//		            cell.setCellValue(resultSet.getInt("RollNo"));
//
//		            cell = row.createCell(2);
//		            cell.setCellValue(resultSet.getString("Name"));
//		            i++;
//		        }
			// Local directory on computer
			File xlsFile = new File("/home/user91/Desktop/student_database_geeks_for_geeks.xlsx");
			FileOutputStream output = new FileOutputStream(xlsFile);

			// write
			workbook.write(output);
			
			// Step 7: Close the connection
			workbook.close();
			output.close();
			System.out.println("exceldatabase.xlsx written successfully " + xlsFile.getCanonicalPath());
			return xlsFile.getAbsolutePath();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}
}
