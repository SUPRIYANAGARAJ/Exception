package com.example1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SpecifyingThrownExceptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		readFileA();
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

