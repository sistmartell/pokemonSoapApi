package com.martell.pokemonapi.dto;

import lombok.Data;

@Data
public class Version_group_details {

	private int level_learned_at;
	private Move_learn_method move_learn_method;
	private Version_group version_group;

}
