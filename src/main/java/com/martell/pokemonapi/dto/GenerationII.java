package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-ii")
public class GenerationII {

	private Crystal crystal;
	private Gold gold;
	private Silver silver;

}
