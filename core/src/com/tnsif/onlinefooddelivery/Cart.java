package com.tnsif.onlinefooddelivery;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Fooditem, Integer> items = new HashMap<>();

    public void addItem(Fooditem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(Fooditem item) {
        items.remove(item);
    }

    public Map<Fooditem, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return items.toString();
    }
}