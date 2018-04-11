package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "order")
public class Order {

	@Id
	@JsonProperty
	@Column(name = "id_order")
	private Integer idOrder;
	
	@JsonProperty
	@ManyToOne(targetEntity = Cart.class)
	@Column(name = "id_cart")
	private Cart idCart;
	
	@JsonProperty
	@ManyToOne(targetEntity = Good.class)
	@Column(name = "id_good")
	private Good idGood;

	
}
