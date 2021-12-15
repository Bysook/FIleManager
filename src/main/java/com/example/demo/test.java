package com.example.demo;

import java.io.File;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		File[] directories = new File("Datos").listFiles(File::isDirectory);
		ArrayList<String> listData = new ArrayList<String>();
		for (File file : directories) {
			file.getName();
			listData.add(file.getName());
		}
	}

}
