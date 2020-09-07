package com.martell.pokemonapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.martell.pokemonapi.entity.Bitacora;
import com.martell.pokemonapi.repository.PokemonRepository;
import com.martell.pokemonapi.service.PokemonService;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	PokemonService pokemonService;
	
	@Autowired
	PokemonRepository pokemonRepository;
	
	
	 @GetMapping("/detail/{id}")
	    public ResponseEntity<?> getById(@PathVariable("id") String id){
	        return new ResponseEntity(pokemonService.getPokemonInfo(id).getBody(), HttpStatus.OK);
	    }
	 
	 
	 @GetMapping("/bitacora")
	 	public @ResponseBody ResponseEntity<List<Bitacora>> getBitacora() {
		 
		 List<Bitacora> listaBitacora = new ArrayList();
		 listaBitacora = pokemonRepository.findAll();
		 
	     return new ResponseEntity(listaBitacora, HttpStatus.OK);
	 }
	 
	 }
