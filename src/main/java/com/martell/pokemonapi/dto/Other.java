package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Other {

	private Dream_world dream_world;
	
	@JsonProperty("official-artwork")
	private OfficialArtwork officialArtwork;

}
