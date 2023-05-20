package com;

public class Cam {
	int id;
	String brand;
	String name;
	String model;
	double price;
	String status;
	public Cam(int id,String brand,String model,double d,String status){
		this.id = id;
		this.brand=brand;
		this.model = model;
		this.price = d;
		this.status = status;
		//System.out.printf ("%7s %15s %15s %15.1f  %22s\n",this.id,this.brand,this.model,this.price,this.status);
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public String getStatus() {
		return status;
	}
	
	
	
}
