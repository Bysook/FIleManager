package com.example.demo.models;

import java.io.File;
import java.util.ArrayList;


import org.springframework.stereotype.Controller;

@Controller
public class modelControl {
	
	public ArrayList<String> getFolderData() {
		
		File[] directories = new File("Datos").listFiles(File::isDirectory);
		ArrayList<String> listData = new ArrayList<String>();
		
		for (File file : directories) {
			file.getName();
			listData.add(file.getName());
		}
		
		return listData;
	}
	
	public ArrayList<Long> getSizeFolder() {
		
		File[] directories = new File("Datos").listFiles(File::isDirectory);
		ArrayList<Long> sizeOfFolders = new ArrayList<Long>();
		
		for (File file : directories) {
			sizeOfFolders.add(getEachSize(file));
		}
		
		return sizeOfFolders;
	}
	
	public ArrayList<String> getFilesData() {
		
		File[] files = new File("Datos").listFiles(File::isFile);
		ArrayList<String> listFiles = new ArrayList<String>();
		
		for (File file : files) {
			file.getName();
			listFiles.add(file.getName());
		}
		
		return listFiles;
	}
	
	private static long getEachSize(File folder) {
		   
        long length = 0;
       
        File[] files = folder.listFiles();
 
        int count = files.length;
 
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getEachSize(files[i]);
            }
        }
        return length;
	 }
}
