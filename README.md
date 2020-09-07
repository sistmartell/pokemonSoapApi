# pokemonSoapApi
Challenge Técnico - Bankaya

_Se desarrollo un Api SOAP con los metodos requeridos:_

* abilities
* base_experience
* held_items
* id
* name
* location_area_encounters

_Todas las consultas se hacen en tiempo real tomando como base el api rest: https://pokeapi.co/, para esto se utiliza restTemplate para consumir el servicio rest, se obtiene el json de respuesta y se mapea al objeto de salida de cada metodo._





## Instrucciones para pruebas

_Desplegar el archivo: pokemonapi-0.0.1-SNAPSHOT.jar (ubicado en la carpe: /target) desde consola con:  java -jar pokemonapi-0.0.1-SNAPSHOT.jar_

_Una vez desplegado el jar que contiene el proyecto, abrir el wsdl desde algun cliente (SoapUi por ejemplo) para poder realizar pruebas._
	
		      http://localhost:8080/service/pokemonDetailsWsdl.wsdl 




_Se utilizo una base de datos local m2 con JPA para crear una bitacora con los request, para validar la bitacora se creo tambien un end point para revisar la misma:_
	
	        http://localhost:8080/pokemon/bitacora
    
  
## Descarga del proyecto compilado

Descarga el archivo .jar listo para ejecutar. [Descargar](https://drive.google.com/file/d/1ThQSw9OPbKJvLFnqOXLjXU7GM5hBDkZx/view?usp=sharing).
