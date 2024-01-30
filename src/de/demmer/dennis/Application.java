package de.demmer.dennis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//-----------------Scanner------------------

//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			
//			String input = scanner.next();
//			input = input.toLowerCase();
//			
//			
//			if(input.equals("time")) {
//				System.out.println(new Date());
//			} else if(input.equals("exit")) {
//				System.exit(0);
//			} else {
//				System.out.println("Befehl: '" + input + "' nicht gefunden");
//			}
		
		
		
		//-----------------BufferedReader------------------
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			try {
				String input = reader.readLine();
				
//				if(input.equals("time")) {
//					System.out.println(new Date());
//				} else if(input.equals("exit")) {
//					System.exit(0);
//				} else {
//					System.out.println("Befehl: '" + input + "' nicht gefunden");
//				}
				
			switch (input) {
			case "time":
				System.out.println(new Date());
				break;
			case "exit":
				System.exit(0);
				break;
			default:
				System.out.println("Befehl: '" + input + "' nicht gefunden");
				break;
			}
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		}
		


	}

}
