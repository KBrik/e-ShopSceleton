package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Good {

	@JsonProperty
	private String articleId;
	
	@JsonProperty
	private String name;
	
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
