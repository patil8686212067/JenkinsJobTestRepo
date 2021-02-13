package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="ORDR_DTLS")

public class OrdersDetailsEntity {

	@Id
	@Column(name="ORDER_ID")
	
	@GenericGenerator(name="order_id_gen",strategy="com.ashokit.entity.OrdersDetailsEntity")
	@GeneratedValue(generator="order_id_gen")
	
	private String orderId;
	
	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getOrderBy() {
		return orderBy;
	}


	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}


	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}


	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}


	@Column(name="ORDER_BY")
	private String orderBy;
	
	
	@Column(name="ORDER_PLACED_DT")
    private Date orderPlacedDate;
}
