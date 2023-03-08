package com.Ebrain;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("c:\\\\test\\\\ajith.txt");
		try {
			Scanner Scanner = new Scanner(file);
			while(Scanner.hasNextLine()) {
				System.out.println(Scanner.nextLine());
				
			}
		} catch (Exception e) {
			System.out.println("error");
			
		}

	}

}
