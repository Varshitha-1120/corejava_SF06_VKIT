package com.tnsif.services;

import java.util.ArrayList;

import com.tnsif.onlinefooddelivery.Customer;
public class CustomerService {
         private ArrayList<Customer> customerList = new ArrayList<>();
         
         public void addCustomer(Customer customer) {
        	 Customer.add(customer);
         }
         
         public Customer getCustomer(int userId) {
        	 return null;
         }
         
         public ArrayList<Customer> grtCustomers() {
        	 return customerList;
         }
}