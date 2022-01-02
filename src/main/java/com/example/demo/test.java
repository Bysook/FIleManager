package com.example.demo;

import java.io.File;
import java.util.ArrayList;

public class test {
	
	private static long getFolderSize(File folder) {
		   
        long length = 0;
       
        File[] files = folder.listFiles();
 
        int count = files.length;
 
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
	 }
	
	

	public static void main(String[] args) {
		
		File[] directories = new File("Datos").listFiles(File::isDirectory);
		ArrayList<Long> sizeOfFolders = new ArrayList<Long>();
		for (File file : directories) {
			System.out.println(getFolderSize(file));
		}
		
		
		
		
//		File[] directories = new File("Datos").listFiles(File::isDirectory);
//		ArrayList<String> listData = new ArrayList<String>();
//		for (File file : directories) {
//			file.getName();
//			listData.add(file.getName());
//		}
	}

}
