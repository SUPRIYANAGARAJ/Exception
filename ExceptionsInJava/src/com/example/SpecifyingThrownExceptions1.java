package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SpecifyingThrownExceptions1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readFile();
	}
		
		public static void readFile() throws IOException {
			
		
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


