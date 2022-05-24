package com.example5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Finally {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
		File file = new File("C:\\Users\\252000\\Desktop\\Exception\\existingFile.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st = br.readLine();
		
		while (st != null) {
			System.out.println(st);
			st = br.readLine();
		}

	}
	
	catch (IOException ex) {
	}
	}
}


