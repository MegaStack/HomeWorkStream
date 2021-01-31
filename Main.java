package com.gmail.oastro36;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File folderIn = new File("e:/in");
		File folderOut = new File("e:/out");

		MyFileFilter myFF = new MyFileFilter("docx", "pdf");
		File[] fileMyList = folderIn.listFiles(myFF);
	
		for (File file : fileMyList) {
			System.out.println(file);
		}
		
		for (File file : fileMyList) {
			
			try {
				File fileBuff = new File(folderOut, "" + file.getName());
				MyCopyFile.fileCopy(file, fileBuff);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
