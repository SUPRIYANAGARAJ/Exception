package com.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SpecifyingThrownExceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			readFileA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Catch and handle exception: " + e);
		}
	}
	
	public static void readFileA() throws IOException {
		readFileB();
	}
		
		public static void readFileB() throws IOException {
			
		
        File file = new File("somfile.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st = br.readLine();
		
		while (st != null) {
			
			System.out.println(st);
			
			st = br.readLine();
		}
		br.close();

	}


}
