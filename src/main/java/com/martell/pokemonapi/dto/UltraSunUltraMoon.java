package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Ultra-sun-ultra-moon")
public class UltraSunUltraMoon {

	private String front_default;
	private String front_female;
	private String front_shiny;
	private String front_shiny_female;

}
