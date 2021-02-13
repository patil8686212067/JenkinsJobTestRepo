package com.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.OrdersDetailsEntity;
import com.ashokit.repository.OrderDtlsRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
	OrderDtlsRepository OrderDtlsRepository = context.getBean(OrderDtlsRepository.class);
		
		OrdersDetailsEntity oredrDtls = new OrdersDetailsEntity();
		
		oredrDtls.setOrderBy("anil");
		oredrDtls.setOrderPlacedDate(new Date());
		
		OrdersDetailsEntity oredrDtls1 =OrderDtlsRepository.save(oredrDtls);
		
		if(oredrDtls1!=null) {
			System.out.println("record save Successfully  ..");
		}else {
			System.out.println("record Not saved in db   ..");

		}
		
	}

}
