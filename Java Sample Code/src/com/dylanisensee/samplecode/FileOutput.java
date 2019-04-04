package com.dylanisensee.samplecode;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
	
	private final static String FILENAME = "C:\\Users\\2743662\\Desktop\\java-workspace\\Java Sample Code\\sample.txt";
	
	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			
			String fileContent = "\nThis was the second line I wrote to the file.";
			
			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(fileContent);
			
			System.out.println("Done");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				if (bw!= null)
					bw.close();
				
				if (fw != null)
					fw.close();
				
			} catch (IOException ex) {
				
				ex.printStackTrace();
				
			}
		}
	}
}
