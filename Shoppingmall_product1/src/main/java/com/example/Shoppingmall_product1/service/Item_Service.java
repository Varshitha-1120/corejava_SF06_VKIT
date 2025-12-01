package com.example.Shoppingmall_product1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Shoppingmall_product1.entity.Item_entity;
import com.example.Shoppingmall_product1.repository.Item_repo;

@Service
public class Item_Service {

	    @Autowired
	    private Item_repo sr;

	    // Create
	    public Item_entity addItem(Item_entity item) {
	        return sr.save(item);
	    }

	    // Get All
	    public List<Item_entity> getItems() {
	        return sr.findAll();
	    }

	    // Delete
	    public void deleteItem(Integer id) {
	        sr.deleteById(id);
	    }
 
	    //update
	    public Item_entity updateItem(Integer id, Item_entity updatedItem) {

	        Item_entity existing = sr.findById(id)
	                .orElseThrow(() -> new RuntimeException("Item not found"));

	        existing.setName(updatedItem.getName());
	        existing.setPrice(updatedItem.getPrice());

	        return sr.save(existing);
		}

}
