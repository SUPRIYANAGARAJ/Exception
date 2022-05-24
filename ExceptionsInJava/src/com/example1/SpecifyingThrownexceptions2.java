package com.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SpecifyingThrownexceptions2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		readFileA();
	}
	
	public static void readFileA() {
		
		readFileB();
	}
		
		public static void readFileB()  {
		
		try {
		
        File file = new File("somfile.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st = br.readLine();
		
		while (st != null) {
			
			System.out.println(st);
			
			st = br.readLine();
		}
		br.close();

	} catch (IOException e) {
		
		System.out.println("Catch and handle exception: " + e);
	}

		}
}
