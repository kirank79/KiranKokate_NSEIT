package com.examples.customerservice.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "posts")
public class Customer {
	
	@Id
	int cid;
	String cname;
	String caddress;
	//Set<Order> orders;

	public Customer() {

	}

	public Customer(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String Caddress) {
		this.caddress = caddress;
	}

}
