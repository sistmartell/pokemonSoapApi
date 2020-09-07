package com.martell.pokemonapi.dto;

import java.util.List;

import lombok.Data;

@Data
public class Held_items {

	private Item item;
	private List<Version_details> version_details;

}
