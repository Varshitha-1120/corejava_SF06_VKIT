package com.example.Shoppingmall_product1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Shoppingmall_product1.entity.Item_entity;

@Repository
public interface Item_repo extends JpaRepository<Item_entity , Integer>{

}
