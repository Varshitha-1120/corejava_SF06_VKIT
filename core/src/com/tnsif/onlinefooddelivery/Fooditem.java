package com.tnsif.onlinefooddelivery;

public class Fooditem {
	private int restaurantID;
    private String name;
    private double price;

    //Constructor
    public Fooditem(int restaurantid, String name, double price) {
    	this.restaurantID = restaurantid;
    	this.name = name;
    	this.price = price;
    }
    

	public int getRestaurantID() {return restaurantID;}

	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fooditem [restaurantID=" + restaurantID + ", name=" + name + ", price=" + price + "]";
	}


	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}