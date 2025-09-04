package com.IOC.DI;

import org.springframework.stereotype.Component;

@Component
public class Customer1 {
	private int id;
	private String cname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void show()
	{
		System.out.println("Customer 1 object printed");
	}

}
