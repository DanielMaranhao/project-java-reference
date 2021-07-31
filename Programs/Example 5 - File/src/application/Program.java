package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	// You need to have the folder C:\temp for this program to work
	
	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "c:\\temp\\text.txt";

		// To write along existing file
		// new FileWriter(path, true)		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File contents:");
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println();

		File originFolder = new File("c:\\temp");

		File[] folders = originFolder.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.println();

		File[] files = originFolder.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		System.out.println();

		boolean success = new File(originFolder.getPath() + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		System.out.println();

		File textFile = new File(path);

		System.out.println("File members:");
		System.out.println("Path: " + textFile.getPath());
		System.out.println("Parent: " + textFile.getParent());
		System.out.println("Name: " + textFile.getName());
	}
}
