package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ViewAllCamera {
	
	ViewAllCamera(){
		System.out.println("FOLLOWING IS THE LIST OF AVAILABLE CAMERAS -");
		System.out.println("======================================================================================");
		System.out.printf("%-15s %-15s %-15s %-15s %15s\n","CAMERA ID","BRAND","MODEL","PRICE(PER DAY)","STATUS");
		System.out.println("======================================================================================");
		Cameras cm = new Cameras();
		cm.print();
		//cm.Cameras();
		System.out.println("======================================================================================");

	
	}
	
}
