package com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Mycamera {
	Scanner sc = new Scanner(System.in);
	public Mycamera(){
		boolean flag = true;
		
		
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
		int arr[] = {1,2,6,7,8,10}; 
		new printmylist(arr);
	}

	private void remove() {
		// TODO Auto-generated method stub
		new ViewAllCamera();
		System.out.print("ENTER THE CAMERA ID TO REMOVE");
		int n = sc.nextInt();
		Remove rm = new Remove(n);
		
	}
	static int i= 1;
	private void add() {
		// TODO Auto-generated method stub
		
		System.out.print("ENTER THE CAMERA BRAND - ");
		String s1 = sc.next();
		System.out.print("ENTER THE MODEL - ");
		String s2 = sc.next();
		System.out.println("ENTER THE PER DAY PRICE(INR) - ");
		Float s3 = (float) sc.nextInt();
		Cameras cm = new Cameras();
		int n=Main.list.size()+(++i);
		Cam camnew = new Cam(n,s1,s2,s3,"Available");
		System.out.println("YOUR CAMERA HAS BEEN SUCESSFULLY ADDED TO THE LIST\n");
		Main.list.add(camnew);
		
	}
	
}
