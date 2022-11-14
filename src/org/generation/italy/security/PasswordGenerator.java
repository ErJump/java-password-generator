package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci il tuo nome");
		String userName = sc.nextLine();
		
		System.out.println("inserisci il tuo cognome");
		String userSurname = sc.nextLine();
		
		System.out.println("inserisci il tuo colore preferito");
		String userColor = sc.nextLine();
		
		System.out.println("inserisci il tuo giorno di nascita");
		int userDay = sc.nextInt();
		
		System.out.println("inserisci il tuo mese di nascita");
		int userMonth = sc.nextInt();
		
		System.out.println("inserisci il tuo anno di nascita");
		int userYear = sc.nextInt();
		
		int resultNumber = userDay + userMonth + userYear;
		
		String password = userName + "-" + userSurname + "-" + userColor + "-" + resultNumber;
		
		System.out.println(password);
		
	}
}
