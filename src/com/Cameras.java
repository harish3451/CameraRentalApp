package com;

import java.util.Iterator;


public class Cameras {
	public void print() {
		Iterator<Cam> itr = Main.list.iterator();
		while(itr.hasNext()){
			Cam cm = itr.next();
			System.out.printf ("%7s %15s %15s %15.1f  %22s\n",cm.getId(),cm.getBrand(),cm.getModel(),cm.getPrice(),cm.getStatus());

		}
	}
}
