package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("+------------------------------------------+");
		System.out.println("|   Welcome to Camera Rental Application   |");
		System.out.println("+------------------------------------------+\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please log in to continue: ");
		System.out.print("Username: ");
		String str1 = sc.nextLine();
		System.out.print("Password: ");
		String str2 = sc.nextLine();
		System.out.println();
		menu.Mainmenu();
		System.out.println("+------------------------------------------+");
		System.out.println("|   Thank you for using this application   |");
		System.out.println("+------------------------------------------+\n");
	}

}
