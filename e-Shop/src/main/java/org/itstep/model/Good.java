package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Good {

	@JsonProperty
	private String name;
	
	@JsonProperty
	private String asin;
	
	@JsonProperty
	private Integer price;
	
	@JsonProperty
	private Integer initialPrice;
	
	@JsonProperty
	private String description;
	
	@JsonProperty
	private String units;
	
	@JsonProperty
	private Boolean availability;
	
}
