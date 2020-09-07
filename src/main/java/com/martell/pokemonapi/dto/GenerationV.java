package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-v")
public class GenerationV {

	@JsonProperty("black-white")
	private BlackWhite blackWhite;

}
