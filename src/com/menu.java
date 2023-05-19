package com;

import java.util.Scanner;

public class menu {

	public static void Mainmenu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			String[] str = {"1. MY CAMERA",
							"2. RENT A CAMERA",
							"3. VIEW ALL CAMERA",
							"4. MY WALLET",
							"5. EXIT"};
			for(String st:str) {
				System.out.println(st);
			}
			int n= sc.nextInt();
			
			switch(n) {
			case 1:
				Mycamera mc = new Mycamera();
				break;
			
			case 2:
				RentCamera rc = new RentCamera();
				break;
				
			case 3:
				ViewAllCamera vac = new ViewAllCamera();
				break;
				
			case 4:
				MyWallet mw = new MyWallet();
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Please enter a valid option");
			
			}
		}

	}

}
