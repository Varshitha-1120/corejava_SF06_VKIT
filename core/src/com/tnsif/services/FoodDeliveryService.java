package com.tnsif.services;

import java.util.Collection;

import com.tnsif.onlinefooddelivery.Customer;
import com.tnsif.onlinefooddelivery.DeliveryPerson;
import com.tnsif.onlinefooddelivery.Fooditem;
import com.tnsif.onlinefooddelivery.Order;
import com.tnsif.onlinefooddelivery.Restaurant;

	
public interface FoodDeliveryService {
	    // Admin functions
	    void addRestaurant(Restaurant r);
	    void addFoodItemToRestaurant(int restaurantId, Fooditem item);
	    void removeFoodItemFromRestaurant(int restaurantId, int itemId);
	    void addDeliveryPerson(DeliveryPerson dp);
	    void assignDeliveryPersonToOrder(int orderId, int dpId);

	    // Customer functions
	    void addCustomer(Customer customer);
	    void addFoodToCart(int customerId, int restaurantId, int itemId, int qty);
	    Order placeOrder(int customerId, String address);

	    // Finders
	    Restaurant findRestaurantById(int id);
	    Customer findCustomerById(int id);
	    DeliveryPerson findDeliveryPersonById(int id);
	    Order findOrderById(int id);

	    // Collections
	    Collection<Restaurant> getAllRestaurants();
	    Collection<Order> getAllOrders();
	    Collection<DeliveryPerson> getAllDeliveryPersons();
	
}
