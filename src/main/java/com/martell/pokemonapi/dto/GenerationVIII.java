package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Generation-viii")
public class GenerationVIII {

	private Icons icons;

}
