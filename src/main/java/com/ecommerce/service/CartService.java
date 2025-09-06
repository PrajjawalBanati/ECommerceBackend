package com.ecommerce.service;

import com.ecommerce.controller.ProductNotFound;
import com.ecommerce.exception.CartItemNotFound;
import com.ecommerce.models.Cart;
import com.ecommerce.models.CartDTO;


public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
