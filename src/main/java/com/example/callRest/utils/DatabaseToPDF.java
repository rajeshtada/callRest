package com.example.callRest.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.example.callRest.entity.Book;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class DatabaseToPDF {
	
	
	
	public String generatePdf(List<Book> bookList) {
//		List<Book> bookList= new ArrayList<Book>();
		File pdfFile = new File("/home/user91/Desktop/Book_Databse.pdf");
		FileOutputStream output;
		try {
//		bookList = bookService.findAllBook();
//		HttpServletResponse response;
			
		output = new FileOutputStream(pdfFile);
	    Document document = new Document(PageSize.A4);			// Creating the Object of Document
	    PdfWriter.getInstance(document, output);				// Getting instance of PdfWriter
	    document.open();										// Opening the created document to change it
	    Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);		// Creating font
	    fontTiltle.setSize(20);									// Setting font style and size
	    Paragraph paragraph1 = new Paragraph("List of the Students", fontTiltle);	// Creating paragraph
	    paragraph1.setAlignment(Paragraph.ALIGN_CENTER);		// Aligning the paragraph in the document
	    paragraph1.setSpacingAfter(3);
	    document.add(paragraph1); 								// Adding the created paragraph in the document
	    PdfPTable table = new PdfPTable(4);						// Creating a table of the 4 columns
	    table.setWidthPercentage(100f);							// Setting width of the table, its columns and spacing
	    table.setWidths(new int[] {3,3,3,3});
	    table.setSpacingBefore(5);
	    PdfPCell cell = new PdfPCell();							// Create Table Cells for the table header
	    cell.setBackgroundColor(CMYKColor.BLUE);				// Setting the background color and padding of the table cell
	    cell.setPadding(5);
	    Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);	// Creating font
	    font.setColor(CMYKColor.WHITE);							// Setting font style and size
	    
	    // Adding headings in the created table cell or  header
	    // Adding Cell to table
	    cell.setPhrase(new Phrase("ID", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Book_Name", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("writer", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("price", font));
	    table.addCell(cell);
	    // Iterating the list of students
	    for (Book student: bookList) {
	      // Adding student id
	      table.addCell(String.valueOf(student.getId()));
	      // Adding student name
	      table.addCell(student.getBookName());
	      // Adding student email
	      table.addCell(student.getWriter());
	      // Adding student mobile
	      table.addCell(String.valueOf(student.getPrice()));
	    }
	    // Adding the created table to the document
	    document.add(table);
	    // Closing the document
	    document.close();
	    System.out.println("Pdf File save success + " + pdfFile.getAbsolutePath() + pdfFile.getCanonicalPath());
	    return pdfFile.getAbsolutePath();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	  }
}
