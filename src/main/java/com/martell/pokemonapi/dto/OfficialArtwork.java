package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Official-artwork")
public class OfficialArtwork {

	private String front_default;
	
}
