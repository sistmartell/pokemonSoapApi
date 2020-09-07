package com.martell.pokemonapi.service;

import org.springframework.http.ResponseEntity;

import com.martell.pokemonapi.dto.Root;

public interface PokemonService {

	public ResponseEntity<Root> getPokemonInfo(String name);
}
