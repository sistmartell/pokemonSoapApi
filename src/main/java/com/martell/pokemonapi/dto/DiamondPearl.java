package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Diamond-pearl")
public class DiamondPearl {

	private String back_default;
    private String back_female;
    private String back_shiny;
    private String back_shiny_female;
    private String front_default;
    private String front_female;
    private String front_shiny;
    private String front_shiny_female;
    
}
