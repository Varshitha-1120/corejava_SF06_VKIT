package com.tnsif.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.onlinefooddelivery.Order;
import com.tnsif.onlinefooddelivery.DeliveryPerson;

public class OrderService {

    private List<Order> orders = new ArrayList<>();
    private List<DeliveryPerson> deliveryPersons = new ArrayList<>();

    // Place a new order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Get all orders
    public List<Order> getOrders() {
        return orders;
    }

    // Add a delivery person
    public void addDeliveryPerson(DeliveryPerson deliveryPerson) {
        deliveryPersons.add(deliveryPerson);
    }

    // Get all delivery persons
    public List<DeliveryPerson> getDeliveryPersons() {
        return deliveryPersons;
    }

    // Assign a delivery person to an order
    public void assignDeliveryPersonToOrder(int orderId, int deliveryPersonId) {

        Order foundOrder = null;
        DeliveryPerson foundDeliveryPerson = null;

        // Find order by ID
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                foundOrder = order;
                break;
            }
        }

        // Find delivery person by ID
        for (DeliveryPerson dp : deliveryPersons) {
            if (dp.getOrderId() == deliveryPersonId) {
                foundDeliveryPerson = dp;
                break;
            }
        }

        if (foundOrder == null) {
            System.out.println("Order not found with ID: " + orderId);
            return;
        }

        if (foundDeliveryPerson == null) {
            System.out.println("Delivery person not found with ID: " + deliveryPersonId);
            return;
        }

        // Successful assignment
        foundOrder.setDeliveryPerson(foundDeliveryPerson);
        foundDeliveryPerson.assignOrder(foundOrder);

        System.out.println("Assigned Delivery Person " + deliveryPersonId + " to Order " + orderId);
    }
}