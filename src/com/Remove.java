package com;

import java.util.Iterator;

public class Remove {
	Remove(int n){
		Iterator<Cam> itr = Main.list.iterator();
		int index = -1;
		while(itr.hasNext()){
			Cam cm = itr.next();
			if(cm.getId() == n) {
				index = Main.list.indexOf(cm);
				Main.list.remove(index);
				break;
			}
		}
		if(index == -1) {
			System.out.println("PLEASE ENTER A VALID CAMERA ID");
		}else {
			System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST.");
		}
	}
}
