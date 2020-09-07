package com.martell.pokemonapi.dto;
import java.util.List;

import com.martell.pokemonapi.dto.Move;
import com.martell.pokemonapi.dto.Version_group_details;

import lombok.Data;

@Data
public class Moves {

	private Move move;
    private List<Version_group_details> version_group_details;
    
}
