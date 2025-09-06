package com.ecommerce.service;

import com.ecommerce.models.CartDTO;
import com.ecommerce.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
