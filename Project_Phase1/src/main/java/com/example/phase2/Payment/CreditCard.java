package com.example.phase2.Payment;

import com.example.phase2.Services.Service;

public class CreditCard implements Payment {

	@Override
	public void pay(Service service) {
		// TODO Auto-generated method stub
		System.out.println("Payed with CreditCard "+service.getCost());
	}

}
