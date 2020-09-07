package com.martell.pokemonapi.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.martell.pokemonapi.dto.Root;

@Service
public class PokemonServiceImpl implements PokemonService {

	private static Logger log = LoggerFactory.getLogger(PokemonServiceImpl.class);

	@Value("${app.service.getInfoPokemon}")
	private String urlInfoPokemon;

	@Override
	public ResponseEntity<Root> getPokemonInfo(String name) {
		Root response = new Root();

		RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		String url = urlInfoPokemon+name;  // ditto
		ResponseEntity<Root> res = rt.exchange(url, HttpMethod.GET, entity,Root.class);
		log.info(res.toString());
		
		return res;
	}

}
