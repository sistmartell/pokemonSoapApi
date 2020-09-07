package com.martell.pokemonapi.dto;

import java.util.List;

import lombok.Data;

@Data
public class Root {

	private List<Abilities> abilities;
	private int base_experience;
	private List<Forms> forms;
	private List<Game_indices> game_indices;
	private int height;
	private List<Held_items> held_items;
	private int id;
	private boolean is_default;
	private String location_area_encounters;
	private List<Moves> moves;
	private String name;
	private int order;
	private Species species;
	private Sprites sprites;
	private List<Stats> stats;
	private List<Types> types;
	private int weight;

}
