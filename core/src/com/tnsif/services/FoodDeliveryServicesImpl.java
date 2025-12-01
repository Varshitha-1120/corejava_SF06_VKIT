package com.tnsif.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.tnsif.onlinefooddelivery.Customer;
import com.tnsif.onlinefooddelivery.DeliveryPerson;
import com.tnsif.onlinefooddelivery.Fooditem;
import com.tnsif.onlinefooddelivery.Order;
import com.tnsif.onlinefooddelivery.Restaurant;

public class FoodDeliveryServicesImpl implements FoodDeliveryService {

    private Map<Integer, Restaurant> restaurants = new HashMap<>();
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, DeliveryPerson> deliveryPersons = new HashMap<>();
    private Map<Integer, Order> orders = new HashMap<>();
    private int orderCounter = 1;

    // ---------------------------------------------
    // ADMIN OPERATIONS
    // ---------------------------------------------
    @Override
    public void addRestaurant(Restaurant r) {
        restaurants.put(r.getId(), r);
    }

    @Override
    public void addFoodItemToRestaurant(int restaurantId, Fooditem item) {
        restaurants.get(restaurantId).addFoodItem(item);
    }

    @Override
    public void removeFoodItemFromRestaurant(int restaurantId, int itemId) {
        restaurants.get(restaurantId).removeFoodItem(itemId);
    }

    @Override
    public void addDeliveryPerson(DeliveryPerson dp) {
        deliveryPersons.put(dp.getDeliveryPersonid(), dp);
    }

    @Override
    public void assignDeliveryPersonToOrder(int orderId, int dpId) {
        Order order = orders.get(orderId);
        DeliveryPerson dp = deliveryPersons.get(dpId);
        if (order != null && dp != null) {
            order.setDeliveryPerson(dp);
        }
    }

    // ---------------------------------------------
    // CUSTOMER OPERATIONS
    // ---------------------------------------------
    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getUserid(), customer);
    }

    @Override
    public void addFoodToCart(int customerId, int restaurantId, int itemId, int qty) {
        Customer c = customers.get(customerId);
        Restaurant r = restaurants.get(restaurantId);

        for (Fooditem fi : r.getMenu()) {
            if (fi.getId() == itemId) {
                c.getCart().addItem(fi, qty);
            }
        }
    }

    @Override
    public Order placeOrder(int customerId, String address) {
        Customer c = customers.get(customerId);

        Order order = new Order(orderCounter++, c);

        for (Fooditem fi : c.getCart().getItems().keySet()) {
            int qty = c.getCart().getItems().get(fi);
            order.addItem(fi, qty);
        }

        order.setDeliveryAddress(address);
        orders.put(order.getOrderId(), order);

        // clear cart
        c.getCart().getItems().clear();

        return order;
    }

    // --------------------------------------------------
    // GETTERS
    // --------------------------------------------------
    public Restaurant findRestaurantById(int id) { return restaurants.get(id); }
    public Customer findCustomerById(int id) { return customers.get(id); }
    public DeliveryPerson findDeliveryPersonById(int id) { return deliveryPersons.get(id); }
    public Order findOrderById(int id) { return orders.get(id); }

    public Collection<Restaurant> getAllRestaurants() { return restaurants.values(); }
    public Collection<Order> getAllOrders() { return orders.values(); }
    public Collection<DeliveryPerson> getAllDeliveryPersons() { return deliveryPersons.values(); }

}