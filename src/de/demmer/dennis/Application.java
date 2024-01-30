package de.demmer.dennis;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//			InputStreamReader isr = new InputStreamReader(System.in);
//			BufferedReader bufferedReader = new BufferedReader(isr);
//		
//			try {
//				System.out.println(bufferedReader.readLine().toUpperCase());
//				System.out.println("Ende des Programms");
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}

		// -------------Scanner------------------

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.next();
			System.out.println(input.toUpperCase());
		}

	}

}
