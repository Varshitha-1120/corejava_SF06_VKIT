package com.tnsif.onlinefooddelivery;

public class Customer extends User {
    private Cart cart = new Cart();

    public Customer(int userId, String username, long contactNo) {
        super(userId, username, contactNo);
    }

    public Cart getCart() {
        return cart;
    }

	public static void add(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}