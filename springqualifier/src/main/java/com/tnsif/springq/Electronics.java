package com.tnsif.springq;

import org.springframework.stereotype.Component;

@Component


public class Electronics implements ShoppingMall{
	public void purchase()
	{
		System.out.println("Going to purchase widgets");
	}

}
