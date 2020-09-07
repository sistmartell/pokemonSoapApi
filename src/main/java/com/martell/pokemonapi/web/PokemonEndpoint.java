package com.martell.pokemonapi.web;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.martell.pokemonapi.dto.Abilities;
import com.martell.pokemonapi.dto.Held_items;
import com.martell.pokemonapi.dto.Root;
import com.martell.pokemonapi.dto.Version_details;
import com.martell.pokemonapi.entity.Bitacora;
import com.martell.pokemonapi.repository.PokemonRepository;
import com.martell.pokemonapi.service.PokemonService;

import https.pokeapi_co.docs.v2.AbilitiesType;
import https.pokeapi_co.docs.v2.Ability;
import https.pokeapi_co.docs.v2.GetAbilitiesRequest;
import https.pokeapi_co.docs.v2.GetAbilitiesResponse;
import https.pokeapi_co.docs.v2.GetBaseExperienceRequest;
import https.pokeapi_co.docs.v2.GetBaseExperienceResponse;
import https.pokeapi_co.docs.v2.GetHeldItemsRequest;
import https.pokeapi_co.docs.v2.GetHeldItemsResponse;
import https.pokeapi_co.docs.v2.GetIdRequest;
import https.pokeapi_co.docs.v2.GetIdResponse;
import https.pokeapi_co.docs.v2.GetLocationAreaEncountersRequest;
import https.pokeapi_co.docs.v2.GetLocationAreaEncountersResponse;
import https.pokeapi_co.docs.v2.GetNameRequest;
import https.pokeapi_co.docs.v2.GetNameResponse;
import https.pokeapi_co.docs.v2.HeldItemsType;
import https.pokeapi_co.docs.v2.Item;
import https.pokeapi_co.docs.v2.ObjectFactory;
import https.pokeapi_co.docs.v2.Version;
import https.pokeapi_co.docs.v2.VersionDetails;

@Endpoint
public class PokemonEndpoint {
	private static final String NAMESPACE_URI = "https://pokeapi.co/docs/v2";

	private static Logger log = LoggerFactory.getLogger(PokemonEndpoint.class);

	@Autowired
	PokemonService pokemonService;

	@Autowired
	PokemonRepository pokemonRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAbilitiesRequest")
	@ResponsePayload
	public GetAbilitiesResponse getAbilities(@RequestPayload GetAbilitiesRequest request) throws Exception {
		ObjectFactory factory = new ObjectFactory();
		GetAbilitiesResponse response = factory.createGetAbilitiesResponse();
		List<AbilitiesType> abilities = new ArrayList();
		ResponseEntity<Root> responseEntity = pokemonService.getPokemonInfo(request.getName());
		Bitacora bitacora = new Bitacora();

		log.info("[getAbilities] Http code: " + responseEntity.getStatusCodeValue());

		if (HttpStatus.OK.equals(responseEntity.getStatusCode()) && responseEntity.getBody() != null
				&& responseEntity.getBody().getAbilities().size() > 0) {
			log.info("[getAbilities] Response: " + responseEntity.getBody().toString());

			abilities = getAbilities(responseEntity.getBody().getAbilities());
						
			bitacora.setFechaTransaccion(new Date());
			bitacora.setIpOrigen(InetAddress.getLocalHost().getHostAddress());
			bitacora.setMetodo("getAbilitiesRequest");
			
			pokemonRepository.save(bitacora);

		} else {
			log.info("[getAbilities] No se encontraron elementos");
		}

		response.getAbilities().addAll(abilities);

		return response;
	}

	private List<AbilitiesType> getAbilities(List<Abilities> abilities) {

		List<AbilitiesType> abilitiesList = new ArrayList();
		Ability abilityType = new Ability();
		AbilitiesType abilitiesType = new AbilitiesType();

		for (Abilities item : abilities) {
			abilityType = new Ability();
			abilitiesType = new AbilitiesType();

			abilityType.setName(item.getAbility().getName());
			abilityType.setUrl(item.getAbility().getUrl());

			abilitiesType.setAbility(abilityType);
			abilitiesType.setHidden(item.is_hidden());
			abilitiesType.setSlot(item.getSlot());
			abilitiesList.add(abilitiesType);
		}

		return abilitiesList;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBaseExperienceRequest")
	@ResponsePayload
	public GetBaseExperienceResponse getBaseExperience(@RequestPayload GetBaseExperienceRequest request)
			throws Exception {
		GetBaseExperienceResponse response = new GetBaseExperienceResponse();
		ResponseEntity<Root> responseEntity = pokemonService.getPokemonInfo(request.getName());
		Bitacora bitacora = new Bitacora();
		log.info("[getAbilities] Http code: " + responseEntity.getStatusCodeValue());

		if (HttpStatus.OK.equals(responseEntity.getStatusCode()) && responseEntity.getBody() != null) {
			log.info("[getAbilities] Response: " + responseEntity.getBody().toString());

			response.setBaseExperience(responseEntity.getBody().getBase_experience());
			
			bitacora.setFechaTransaccion(new Date());
			bitacora.setIpOrigen(InetAddress.getLocalHost().getHostAddress());
			bitacora.setMetodo("getBaseExperienceRequest");
			
			pokemonRepository.save(bitacora);
		} else {
			log.info("[getAbilities] No se encontraron elementos");
		}

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHeld_itemsRequest")
	@ResponsePayload
	public GetHeldItemsResponse getHeld_items(@RequestPayload GetHeldItemsRequest request) throws Exception {
		ObjectFactory factory = new ObjectFactory();
		GetHeldItemsResponse response = factory.createGetHeldItemsResponse();
		List<HeldItemsType> held_items = new ArrayList();
		Bitacora bitacora = new Bitacora();
		ResponseEntity<Root> responseEntity = pokemonService.getPokemonInfo(request.getName());

		log.info("[getAbilities] Http code: " + responseEntity.getStatusCodeValue());

		if (HttpStatus.OK.equals(responseEntity.getStatusCode()) && responseEntity.getBody() != null
				&& responseEntity.getBody().getAbilities().size() > 0) {
			log.info("[getAbilities] Response: " + responseEntity.getBody().toString());

			held_items = getHeld_items(responseEntity.getBody().getHeld_items());
			bitacora.setFechaTransaccion(new Date());
			bitacora.setIpOrigen(InetAddress.getLocalHost().getHostAddress());
			bitacora.setMetodo("getHeld_itemsRequest");
			
			pokemonRepository.save(bitacora);
		} else {
			log.info("[getAbilities] No se encontraron elementos");
		}

		response.getHeldItems().addAll(held_items);
		return response;
	}

	private List<HeldItemsType> getHeld_items(List<Held_items> held_items) {

		List<HeldItemsType> held_itemsList = new ArrayList();

		HeldItemsType heldItemsType = new HeldItemsType();
		VersionDetails versionDetails = new VersionDetails();
		Version version = new Version();
		List<VersionDetails> versionDetailsList = new ArrayList();
		Item itemObj = new Item();

		for (Held_items item : held_items) {
			versionDetailsList = new ArrayList();
			heldItemsType = new HeldItemsType();
			itemObj = new Item();

			itemObj.setName(item.getItem().getName());
			itemObj.setUrl(item.getItem().getUrl());

			for (Version_details item2 : item.getVersion_details()) {
				versionDetails = new VersionDetails();
				version = new Version();

				version.setName(item2.getVersion().getName());
				version.setUrl(item2.getVersion().getUrl());

				versionDetails.setRarity(item2.getRarity());
				versionDetails.setVersion(version);
				versionDetailsList.add(versionDetails);
			}

			heldItemsType.setItem(itemObj);
			heldItemsType.setVersionDetails(versionDetailsList);

			held_itemsList.add(heldItemsType);
		}

		return held_itemsList;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getIdRequest")
	@ResponsePayload
	public GetIdResponse getId(@RequestPayload GetIdRequest request) throws Exception {
		ObjectFactory factory = new ObjectFactory();
		GetIdResponse response = factory.createGetIdResponse();
		Bitacora bitacora = new Bitacora();
		ResponseEntity<Root> responseEntity = pokemonService.getPokemonInfo(request.getName());

		log.info("[getAbilities] Http code: " + responseEntity.getStatusCodeValue());

		if (HttpStatus.OK.equals(responseEntity.getStatusCode()) && responseEntity.getBody() != null) {
			log.info("[getAbilities] Response: " + responseEntity.getBody().toString());

			response.setId(responseEntity.getBody().getId());
			bitacora.setFechaTransaccion(new Date());
			bitacora.setIpOrigen(InetAddress.getLocalHost().getHostAddress());
			bitacora.setMetodo("getIdRequest");
			
			pokemonRepository.save(bitacora);
		} else {
			log.info("[getAbilities] No se encontraron elementos");
		}

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNameRequest")
	@ResponsePayload
	public GetNameResponse getName(@RequestPayload GetNameRequest request) throws Exception {
		ObjectFactory factory = new ObjectFactory();
		GetNameResponse response = factory.createGetNameResponse();
		Bitacora bitacora = new Bitacora();
		ResponseEntity<Root> responseEntity = pokemonService.getPokemonInfo(request.getName());

		log.info("[getAbilities] Http code: " + responseEntity.getStatusCodeValue());

		if (HttpStatus.OK.equals(responseEntity.getStatusCode()) && responseEntity.getBody() != null) {
			log.info("[getAbilities] Response: " + responseEntity.getBody().toString());

			response.setName(responseEntity.getBody().getName());
			bitacora.setFechaTransaccion(new Date());
			bitacora.setIpOrigen(InetAddress.getLocalHost().getHostAddress());
			bitacora.setMetodo("getNameRequest");
			
			pokemonRepository.save(bitacora);
		} else {
			log.info("[getAbilities] No se encontraron elementos");
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocation_area_encountersRequest")
	@ResponsePayload
	public GetLocationAreaEncountersResponse getLocation_area_encounters(
			@RequestPayload GetLocationAreaEncountersRequest request) throws Exception {
		ObjectFactory factory = new ObjectFactory();
		GetLocationAreaEncountersResponse response = factory.createGetLocationAreaEncountersResponse();
		Bitacora bitacora = new Bitacora();
		ResponseEntity<Root> responseEntity = pokemonService.getPokemonInfo(request.getName());

		log.info("[getAbilities] Http code: " + responseEntity.getStatusCodeValue());

		if (HttpStatus.OK.equals(responseEntity.getStatusCode()) && responseEntity.getBody() != null) {
			log.info("[getAbilities] Response: " + responseEntity.getBody().toString());

			response.setLocationAreaEncounters(responseEntity.getBody().getLocation_area_encounters());
			bitacora.setFechaTransaccion(new Date());
			bitacora.setIpOrigen(InetAddress.getLocalHost().getHostAddress());
			bitacora.setMetodo("getLocation_area_encountersRequest");
			
			pokemonRepository.save(bitacora);
		} else {
			log.info("[getAbilities] No se encontraron elementos");
		}
		return response;
	}

}