package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-vi")
public class GenerationVI {

	@JsonProperty("omegaruby-alphasapphire")
	private OmegarubyAlphasapphire omegarubyAlphasapphire;
	@JsonProperty("x-y")
	private XY xy;

}
