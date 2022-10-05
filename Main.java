package com.soprasteria;

import java.util.Scanner;

public class Main {


		int GIORNI_31 = 31;
		int GIORNI_30 = 30;
		int GIORNI_28 = 28;
		static String mesi28 = "febbraio";
		static String mesi30 = "novembreaprilegiugnosettembre";
		static String mesi31 = "ottobredicembregennaiomarzomaggioluglio";
		static String mesi;

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
			System.out.println(">>inserisci il mese:");
			mesi = input.nextLine();
			if(mesi28.contains(mesi)){
				System.out.println("ha 28 giorni");
			}else if(mesi30.contains(mesi)){
				System.out.println("ha 30 giorni");
			} if(mesi31.contains(mesi))	System.out.println("ha 31 giorni");
			input.close();

	}

}
