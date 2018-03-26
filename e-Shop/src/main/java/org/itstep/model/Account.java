package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
	
	@JsonProperty
	private String login;
	@JsonProperty
	private String password;
	@JsonProperty
	private String firstName;
	@JsonProperty
	private String secondName;
	@JsonProperty
	private String telephone;
	
	public Account() {
	}
	
}
