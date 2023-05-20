package com;

import java.util.Iterator;
import java.util.Scanner;


public class RentCamera {
	RentCamera(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("FOLLOWING IS THE LIST OF AVAILABLE CAMERAS -");
		System.out.println("======================================================================================");
		System.out.printf("%-15s %-15s %-15s %-15s %15s\n","CAMERA ID","BRAND","MODEL","PRICE(PER DAY)","STATUS");
		System.out.println("======================================================================================");
		Iterator<Cam> itr = Main.list.iterator();
		while(itr.hasNext()) {
			Cam cm = itr.next();
			if(cm.getStatus()=="Rented") {
				continue;
			}
			System.out.printf ("%7s %15s %15s %15.1f  %22s\n",cm.getId(),cm.getBrand(),cm.getModel(),cm.getPrice(),cm.getStatus());

		}
		
		System.out.println("======================================================================================");

		System.out.println("ENTER THE CAMERA ID YOU WANT TO RENT - ");
		int id = sc.nextInt();
		rentcamera(id);
	}

	private void rentcamera(int id) {
		// TODO Auto-generated method stub
		Iterator<Cam> itr = Main.list.iterator() ;
		while(itr.hasNext()) {
			Cam cm = itr.next();
			
				if(cm.getId() == id) {
					if(cm.getStatus() == "Available") {
					double price = cm.getPrice();
					if(price > MyWallet.n) {
						System.out.println("YOUR CURRENT WALLET BALANCE IS LESS THEN RENT PRICE OF CAMERA");
						break;
					}
					MyWallet.n -=price;
					cm.setStatus("Rented");
					System.out.println("YOUR TRANSACTION FOR CAMERA "+cm.getBrand()+" "+cm.getModel()+" with rent INR."+cm.getPrice()+" HAS SUCCESSFULLY COMPLETED");
					System.out.println("YOUR CURRENT BALANCE AFTER TRANSACTION IS "+MyWallet.n);
					break;
				}
				
					else {
						System.out.println("CAMERA IS ALREADY RENTED ");
						break;
					}
			}
		}
	}
}
