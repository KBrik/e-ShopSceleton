package org.itstep.model;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WishList {

	@JsonProperty
	private Integer id;
	
	@JsonProperty
	@ManyToOne
	private Account account;
	
	@JsonProperty
	@ManyToOne
	private Good good;
		
}
