package com.example3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		       File fileIn = new File("C:\\Users\\252000\\Desktop\\Exception\\existingFile.txt");
		       File fileOut = new File("C:\\Users\\252000\\Desktop\\Exception\\anotherfile.txt");
		       
			    try (BufferedReader br = new BufferedReader(new FileReader(fileIn));
			    	   BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut)))	{
			 
			    	bw.write("This is another copy!\n");
				
				String st = null;
				
				while ((st = br.readLine()) != null) {
					
					System.out.println(st);
				}
					
				} catch (IOException e) {
					 System.out.println("Catch and handle exception: " + e);
				}

		   }
	}


