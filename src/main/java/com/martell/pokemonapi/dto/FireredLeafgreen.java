package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Firered-leafgreen")
public class FireredLeafgreen {

	private String back_default;
	private String back_shiny;
	private String front_default;
	private String front_shiny;

}
