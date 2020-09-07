package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-iv")
public class GenerationIV {

	@JsonProperty("diamond-pearl")
	private DiamondPearl diamondPearl;
	@JsonProperty("heartgold-soulsilver")
	private HeartgoldSoulsilver heartgoldSoulsilver;
	private Platinum platinum;
	
}
