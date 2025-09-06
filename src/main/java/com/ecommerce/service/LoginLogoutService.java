package com.ecommerce.service;

import com.ecommerce.models.CustomerDTO;
import com.ecommerce.models.SellerDTO;
import com.ecommerce.models.SessionDTO;
import com.ecommerce.models.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}
