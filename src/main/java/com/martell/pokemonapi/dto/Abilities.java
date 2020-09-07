package com.martell.pokemonapi.dto;

import lombok.Data;

@Data
public class Abilities {

	private Ability ability;
	private boolean is_hidden;
	private int slot;

}
