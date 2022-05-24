package com.example5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Finally2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			File file = new File("C:\\Users\\252000\\Desktop\\Exception\\existingFile.txt");
			//File file = new File("C:\\Users\\252000\\Desktop\\Exception\\doesnotexist.txt");
			
			 br = new BufferedReader(new FileReader(file));
			
			String st = br.readLine();
			
			while (st != null) {
				System.out.println(st);
				st = br.readLine();
			}

		}
		
		catch (IOException ex) {
			
			System.out.println("Exception caught" +ex);
		}
		 finally {
			 if (br != null) {
				 try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println("Close the buffered reader in the finally block");
			 } else {
				 System.out.println("The buffered reader was never opened");
			 }
		 }
		

	}


	}

