package com;

import java.util.Scanner;

public class MyWallet {
	static int n= 1500;
		public MyWallet() {
			Scanner sc = new Scanner(System.in);
			System.out.println("YOUR CURRENT WALLET BALANCE IS : "+n);
			System.out.println("DO YOU WANT TO ADD MONEY IN WALLET (1.YES 2.NO)");
			int nt = sc.nextInt();
			if(nt == 1) {
				
				System.out.print("ENTER THE AMOUNT (INR) : ");
				int am = sc.nextInt();
				this.n= n+am;
				System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT ACCOUNT BALANCE IS : "+this.n);
			}
			System.out.println("YOU ARE BEING REDIRECTED TO MAIN MENU");
		}
}
