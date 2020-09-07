package com.martell.pokemonapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "bitacora")
public class Bitacora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "ip_origen")
    private String ipOrigen;
    

    @Column(name = "fecha_transaccion")
    @Temporal(TemporalType.DATE)
    private Date fechaTransaccion;
    
    @Column(name = "metodo")
    private String metodo;
}
