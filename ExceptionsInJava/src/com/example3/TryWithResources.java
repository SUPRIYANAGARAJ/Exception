package com.example3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File fileIn = new File("C:\\Users\\252000\\Desktop\\Exception\\existingFile.txt");
		File fileIn = new File("C:\\Users\\252000\\Desktop\\Exception\\someFile.txt");
	    try (BufferedReader br = new BufferedReader(new FileReader(fileIn))) {
		
		String st = null;
		
		while ((st = br.readLine()) != null) {
			
			System.out.println(st);
		}
			
		} catch (IOException e) {
			 System.out.println("Catch and handle exception: " + e);
		}

   }
}

