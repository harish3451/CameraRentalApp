package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static List<Cam> list = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list.add(new Cam(1,"Samsung","DS123",500.0,"Available"));
		list.add(new Cam(2,"Sony","HD123",500.0,"Available"));
		list.add(new Cam(3,"Panasonic","XC",500.0,"Available"));

		list.add(new Cam(4,"Canon","XLR",500.0,"Available"));

		list.add(new Cam(5,"Fujistu","JX",500.0,"Available"));

		list.add(new Cam(6,"Sony","HD226",500.0,"Available"));

		list.add(new Cam(7,"LG","L123",500.0,"Available"));
		list.add(new Cam(8,"Canon","XPL",500.0,"Available"));
		list.add(new Cam(9,"Sony","XPL",500.0,"Rented"));
		list.add(new Cam(10,"Chroma","CT",500.0,"Available"));
		list.add(new Cam(11,"Canon","Digital",123.0,"Available"));
		list.add(new Cam(12,"Nikon","DSLR-D7500",500.0,"Rented"));
		list.add(new Cam(13,"Canon","DS123",500.0,"Available"));

		list.add(new Cam(14,"Sony","DSLR12",200.0,"Available"));
		list.add(new Cam(15,"sony","SONY1234",120.0,"Available"));
		list.add(new Cam(16,"canon","DS123",500.0,"Available"));
		
		
		
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
