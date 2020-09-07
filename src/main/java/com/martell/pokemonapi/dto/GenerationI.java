package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-i")
public class GenerationI {

	@JsonProperty("red-blue")
	private RedBlue redBlue;
	private Yellow yellow;

}
