package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="`order`")
public class order {
	@Id
	private int id;
	private String ordername;
	private String orderadddress;
	private int orderpincode;
	private String orderstate;
	private String ordercountry;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrderadddress() {
		return orderadddress;
	}
	public void setOrderadddress(String orderadddress) {
		this.orderadddress = orderadddress;
	}
	public int getOrderpincode() {
		return orderpincode;
	}
	public void setOrderpincode(int orderpincode) {
		this.orderpincode = orderpincode;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	public String getOrdercountry() {
		return ordercountry;
	}
	public void setOrdercountry(String ordercountry) {
		this.ordercountry = ordercountry;
	}
	public order(int id, String ordername, String orderadddress, int orderpincode, String orderstate,
			String ordercountry) {
		super();
		this.id = id;
		this.ordername = ordername;
		this.orderadddress = orderadddress;
		this.orderpincode = orderpincode;
		this.orderstate = orderstate;
		this.ordercountry = ordercountry;
	}
	public order() {
		super();
	}
	
}
