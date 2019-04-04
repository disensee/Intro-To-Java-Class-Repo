package com.dylanisensee.samplecode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {
		
		//creating File instance to reference text file in Java
		File sample = new File("C:\\Users\\2743662\\Desktop\\java-workspace\\Java Sample Code\\sample.txt");
		
		//creating Scanner instance to read file in Java
		Scanner scanner = new Scanner(sample);
		
		int lineNumber = 1;
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
			lineNumber++;
		}
	}

}
