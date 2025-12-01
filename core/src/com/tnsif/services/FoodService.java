package com.tnsif.services;

import java.util.ArrayList;
import java.util.List;

import com.tnsif.onlinefooddelivery.Restaurant;
import com.tnsif.onlinefooddelivery.Fooditem;

public class FoodService {

    private List<Restaurant> restaurants = new ArrayList<>();

    // Add a restaurant
    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    // Get all food items from all restaurants
    public List<Fooditem> getAllFoodItems() {
        List<Fooditem> allFoodItems = new ArrayList<>();

        for (Restaurant restaurant : restaurants) {
            allFoodItems.addAll(restaurant.getMenu());
        }

        return allFoodItems;
    }

    // Add a food item to a restaurant
    public void addFoodItemToRestaurant(int restaurantId, Fooditem foodItem) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == restaurantId) {
                restaurant.getMenu().add(foodItem);
                return;
            }
        }
        System.out.println("Restaurant not found with ID: " + restaurantId);
    }

    // Remove a food item from a restaurant
    public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == restaurantId) {

                restaurant.getMenu().removeIf(item -> item.getId() == foodItemId);
                return;
            }
        }
        System.out.println("Restaurant not found with ID: " + restaurantId);
    }

    // Get all restaurants
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}