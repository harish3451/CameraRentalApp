package com;

import java.util.Iterator;


public class printmylist {
	printmylist(int[] arr){
		System.out.println("FOLLOWING IS THE LIST OF MY CAMERAS -");
		System.out.println("======================================================================================");
		System.out.printf("%-15s %-15s %-15s %-15s %15s\n","CAMERA ID","BRAND","MODEL","PRICE(PER DAY)","STATUS");
		System.out.println("======================================================================================");
		
		for(int i=0;i<arr.length;i++) {
		
			Cam cm = Main.list.get(arr[i]-1);
			
			System.out.printf ("%7s %15s %15s %15.1f  %22s\n",cm.getId(),cm.getBrand(),cm.getModel(),cm.getPrice(),cm.getStatus());
		
			
		}
		System.out.println("======================================================================================");

	}

	
}
