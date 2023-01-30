package my_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
	public static void main(String[] args) {
		readFile("myFile.txt");

	}
	
	private static void readFile(String filename) {
		try {
			FileReader reader = new FileReader(filename);
		}
		
		catch (FileNotFoundException fnfe) {
			System.out.println("Hey! that file does not exist");
		}

	}
}