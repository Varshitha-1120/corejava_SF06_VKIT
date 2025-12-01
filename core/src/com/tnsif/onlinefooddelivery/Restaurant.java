package com.tnsif.onlinefooddelivery;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
       private int id;
       private String name;
       private List<Fooditem> menu = new ArrayList<>();
       
       public Restaurant(int id, String name) {
    	   this.id = id;
    	   this.name = name;
       }
       
       public int getId() { return id; }
       public String getName() { return name; }
       public List<Fooditem> getMenu() { return menu; 
       }

       public void addFoodItem(Fooditem item) {
           menu.add(item);
       }

       public void removeFoodItem(int itemId) {
           menu.removeIf(i -> i.getId() == itemId);
       }

	   @Override
	   public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + "]";
	   }
       
}
     
