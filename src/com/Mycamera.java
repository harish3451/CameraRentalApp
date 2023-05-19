package com;

import java.util.Scanner;

public class Mycamera {
	public Mycamera(){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			String[] str = {"1. ADD",
					"2. REMOVE",
					"3. VIEW MY CAMERA",
					"4. GO TO PREVIOUS MENU"};
			
			for(String st:str) {
				System.out.println(st);
			}
			int n = sc.nextInt();
			switch(n) {
			case 1:
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				mycameralist();
				break;
			case 4:
				flag = false;
			}
		}
		
	}

	private void mycameralist() {
		// TODO Auto-generated method stub
		
	}

	private void remove() {
		// TODO Auto-generated method stub
		
	}

	private void add() {
		// TODO Auto-generated method stub
		
	}

	
}
