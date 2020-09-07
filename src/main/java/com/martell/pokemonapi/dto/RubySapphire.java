package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Ruby-sapphire")
public class RubySapphire {

	private String back_default;
	private String back_shiny;
	private String front_default;
	private String front_shiny;

}
