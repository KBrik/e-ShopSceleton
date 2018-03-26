package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cart {

	@JsonProperty
	private Integer id;
	
	@JsonProperty
	private Account account;
	
	@JsonProperty
	private Long creationTime;
	
}
