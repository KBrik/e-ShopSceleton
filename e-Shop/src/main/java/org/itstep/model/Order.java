package org.itstep.model;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

	@JsonProperty
	private Integer idOrder;
	
	@JsonProperty
	@ManyToOne
	private Cart idCart;
	
	@JsonProperty
	@ManyToOne
	private Good idGood;

	
}
