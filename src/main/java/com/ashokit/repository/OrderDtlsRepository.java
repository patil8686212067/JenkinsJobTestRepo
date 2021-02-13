package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.OrdersDetailsEntity;

public interface OrderDtlsRepository extends JpaRepository<OrdersDetailsEntity,Serializable>  {

}
