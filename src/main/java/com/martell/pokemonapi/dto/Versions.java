package com.martell.pokemonapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Versions {

	@JsonProperty("generation-i")
    private GenerationI generationI;
    @JsonProperty("generation-ii")
    private GenerationII generationII;
    @JsonProperty("generation-iii")
    private GenerationIII generationIII;
    @JsonProperty("generation-iv")
    private GenerationIV generationIV;
    @JsonProperty("generation-v")
    private GenerationV generationV;
    @JsonProperty("generation-vi")
    private GenerationVI generationVI;
    @JsonProperty("generation-vii")
    private GenerationVII generationVII;
    @JsonProperty("generation-viii")
    private GenerationVIII generationVIII;
    
}
