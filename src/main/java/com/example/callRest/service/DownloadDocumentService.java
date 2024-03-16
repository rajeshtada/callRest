package com.example.callRest.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class DownloadDocumentService {

    public byte[] downloadFile(String pathFile) throws IOException {
    	
    	Path path1 = Paths.get(pathFile);
    	byte[] fileContent = null;
    	fileContent = Files.readAllBytes(path1);
        return fileContent;
    }

}