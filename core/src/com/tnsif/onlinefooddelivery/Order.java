package com.tnsif.onlinefooddelivery;


	import java.util.HashMap;
	import java.util.Map;

	public class Order {
	    private int orderId;
	    private Customer customer;
	    private Map<Fooditem, Integer> items = new HashMap<>();
	    private String status = "Pending";
	    private DeliveryPerson deliveryPerson;
	    private String deliveryAddress;

	    public Order(int orderId, Customer customer) {
	        this.orderId = orderId;
	        this.customer = customer;
	    }

	    public int getOrderId() { return orderId; }
	    public Customer getCustomer() { return customer; }
	    public Map<Fooditem, Integer> getItems() { return items; }
	    public String getStatus() { return status; }
	    public DeliveryPerson getDeliveryPerson() { return deliveryPerson; }

	    public void setStatus(String status) { this.status = status; }
	    public void setDeliveryPerson(DeliveryPerson deliveryPerson) { this.deliveryPerson = deliveryPerson; }
	    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }

	    public void addItem(Fooditem item, int qty) {
	        items.put(item, qty);
	    }

	    @Override
	    public String toString() {
	        return "Order{" +
	                "orderId=" + orderId +
	                ", customer=" + customer.getUsername() +
	                ", items=" + items +
	                ", status='" + status + '\'' +
	                ", deliveryPerson=" + (deliveryPerson != null ? deliveryPerson.getName() : "Not Assigned") +
	                '}';
	    }
	}

