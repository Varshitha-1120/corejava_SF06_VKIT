package com.example.Shoppingmall_product1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shoppingmall_product1.entity.Item_entity;
import com.example.Shoppingmall_product1.service.Item_Service;


//postman->controller->service->repository->database
@RestController
public class Item_Controller {
        
	    @Autowired
	   public Item_Service ss;

	    @PostMapping("/add")  //save data
	    public Item_entity addItem(@RequestBody Item_entity item) {
	        return ss.addItem(item);
	    }

	    @GetMapping("/get")  //to get data
	    public List<Item_entity> getItems() {
	        return ss.getItems();
	    }

	    @DeleteMapping("/delete/{id}")  //
	    public String deleteItem(@PathVariable("id") Integer id) {
	        ss.deleteItem(id);
	        return "Item deleted successfully";
	    }
	    
	    @PutMapping("/update/{id}")
	    public Item_entity updateItem(@PathVariable Integer id, @RequestBody Item_entity updatedItem) {
	        return ss.updateItem(id, updatedItem);
	    }
	}

