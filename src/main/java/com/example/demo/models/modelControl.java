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
	
	
//	public static long folderSize(File directory) {
//	    long length = 0;
//	    for (File file : directory.listFiles()) {
//	        if (file.isFile())
//	            length += file.length();
//	        else
//	            length += folderSize(file);
//	    }
//	    return length;
//	}

}
