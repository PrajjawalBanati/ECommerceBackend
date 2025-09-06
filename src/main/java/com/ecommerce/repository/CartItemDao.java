package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
