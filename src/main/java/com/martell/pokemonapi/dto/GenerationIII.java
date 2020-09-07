package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-iii")
public class GenerationIII {

	private Emerald emerald;
	@JsonProperty("firered-leafgreen")
	private FireredLeafgreen fireredLeafgreen;
	@JsonProperty("ruby-sapphire")
	private RubySapphire rubySapphire;

}
