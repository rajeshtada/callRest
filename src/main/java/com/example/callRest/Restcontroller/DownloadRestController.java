package com.example.callRest.Restcontroller;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.callRest.service.DownloadDocumentService;

@RestController
@RequestMapping("api")
public class DownloadRestController {

	@Autowired
	private DownloadDocumentService downloadDocumentService;

	private static final String APPLICATION_MS_WORD_VALUE = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";

	@PostMapping(value = "/download", produces = APPLICATION_MS_WORD_VALUE)
	    public ResponseEntity<byte[]> downloadFile(@RequestBody String pathFile) throws IOException {
	    	  ResponseEntity<byte[]> body = null;
	    	try {
	    		 byte[] content = downloadDocumentService.downloadFile(pathFile);
//	    		 String.format("inline; filename=\"" + file.getName() + "\"")
	 	        body = ResponseEntity.ok()
	 	                             .contentLength(content.length)
	 	                             .header(HttpHeaders.CONTENT_TYPE, APPLICATION_MS_WORD_VALUE)
	 	                             .header(HttpHeaders.CONTENT_DISPOSITION, String.format("inline; filename=\"" + pathFile + "\"")).body(content);
	 	        
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	return body;
	    }
	    
	    @GetMapping("downloadResidentErrorFile")
		public void downloadResidentErrorFile(@RequestBody String pathFile, HttpServletRequest request,
				HttpServletResponse response) {
			String sourcePath = pathFile;
			Path path1 = Paths.get(sourcePath);
			byte[] fileContent = null;
			try {
				fileContent = Files.readAllBytes(path1);
				response.setHeader("Cache-Control", "no-store");
				response.setDateHeader("Expires", 0);
				response.setContentType("application/x-msdownload");
				response.setHeader("Content-disposition", "attachment; filename=" + "errorFile.xls");

				String mimeType = URLConnection.guessContentTypeFromName(pathFile);
				if (mimeType == null) {
					mimeType = "application/octet-stream";
				}
				response.setContentType(mimeType);
				ServletOutputStream responseOutputStream = response.getOutputStream();
				responseOutputStream.write(fileContent);
				responseOutputStream.flush();
				responseOutputStream.close();
				return;

			} catch (IOException e) {
				String errorMessage = "Sorry!! The file you are looking for does not exist or it may be system IO Problem.";
				OutputStream outputStream;
				try {
					outputStream = response.getOutputStream();
					outputStream.write(errorMessage.getBytes(Charset.forName("UTF-8")));
					outputStream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		}
	    
}
