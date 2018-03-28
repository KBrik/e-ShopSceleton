package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

	@JsonProperty
	private String idOrder;
	
	@JsonProperty
	//@ManyToOne
	private Cart idCart;
	
	@JsonProperty
	//@ManyToOne
	private Good idGood;

	
}
