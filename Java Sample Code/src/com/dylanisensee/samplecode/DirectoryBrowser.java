package com.dylanisensee.samplecode;
import java.util.Date;
import java.util.Scanner;
import java.io.File;

public class DirectoryBrowser {
	
	public static void main(String[] args) {
		
		DirectoryBrowser db = new DirectoryBrowser();
		db.browse();
	
		// Your job is to implement the code in the showFolderContents() method
		
	}
	
	// make sure to use \\ between each folder in your path
	private String currentPath = "c:\\";
	// note that if you don't have permission to browse the C drive, you may have to set the path to your desktop.
	
	public String getCurrentPath() {
		return currentPath;
	}
		
	public void setCurrentPath(String currentFolder) {
		this.currentPath = currentFolder;
	}
	
	public void showFolderContents(String path){
		
		System.out.println("Current Path: " + path);
		
		
		// Your job is to list all the files and folders that are in the current path.
		// To do this, you will use the File class, which is in the java.io package.
		
		// Note: In instance of the File class can represent either a file on the file system OR a folder on the file system 
		// (a folder is simply a special file that can contain other files and folders).
		
		// Note: Here is the official documentation for the file API:
		// https://docs.oracle.com/javase/7/docs/api/java/io/File.html
		// See if you can figure out the steps by just using the official API documentation.
		// If you get stuck, then you can google for other resources to help you.
		
		
		// Step 1 - Create an instance of the File class
		// Use the path parameter to instantiate a File object...
		// Invoke the File constructor function and pass in the path as a parameter to the constructor
		// Store the object in a variable named 'fileObj'
		File fileObj = new File(path); 
		
		// Step 2 - Check to see if the fileObj represents a folder/directory (as opposed to a file on the file system)
		boolean isDir = fileObj.isDirectory();
		boolean isFile = fileObj.isFile();
		// Step 3
		// If the fileObj does indeed refer to a folder on the file system 
		// then continue to Step 4
		// If it it does not represent a folder then simply print the the path parameter concatenated to " is not a folder."
		if(isFile) {
			System.out.println(path + " is not a folder");
		}
		// Step 4
		// Use the fileObj to get an array of all the File objects that are contained within the folder
		// Loop through all the files and folders in the array and list the following information for each one
		// The name of the file/folder
		// Whether or not the file is a folder, or a regular file 
		// The size in KB (for files only, not folders)
		// When the file was last modified
		if(isDir) {
			File[] dirContents = fileObj.listFiles();
			for(int i = 0; i < dirContents.length; i++) {
				String fileName = dirContents[i].getName();
				Date lastModified = new Date(dirContents[i].lastModified());
				long fileSize = (long) (dirContents[i].length() * 0.001);
				System.out.println("File Name: " + fileName);
				if(dirContents[i].isDirectory()) {
					System.out.println("File Type: Folder");
					System.out.println("Last Modified: " + lastModified);
				}else if(dirContents[i].isFile()) {
					System.out.println("File Type: File");
					System.out.println("File Size: " + fileSize + "KB");
					System.out.println("Last Modified: " + lastModified);
				}
			}
		}
		
		// Step 5 - Experiment with the String.format() method and format specifier to see if you can make all the
		// date printed out in step 4 easy to read.
				
		
	}
	
	public void browse(){
		showFolderContents(currentPath);
		System.out.println("Which folder would you like to open?");
		Scanner keyboard = new Scanner(System.in);
		String selectedFolder = keyboard.nextLine();
		this.currentPath += "\\" + selectedFolder;
		browse();
		
	}

}