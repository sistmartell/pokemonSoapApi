package com.martell.pokemonapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martell.pokemonapi.entity.Bitacora;


public interface PokemonRepository extends JpaRepository<Bitacora,Integer> {

}
