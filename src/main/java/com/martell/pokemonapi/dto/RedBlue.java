package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Red-blue")
public class RedBlue {

	private String back_default;
	private String back_gray;
	private String front_default;
	private String front_gray;

}
