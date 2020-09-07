package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-vii")
public class GenerationVII {

	private Icons icons;
	@JsonProperty("ultra-sun-ultra-moon")
	private UltraSunUltraMoon ultraSunUltraMoon;

}
