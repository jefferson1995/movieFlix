package com.devsuperior.movieflix.controllers.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

//Classe auxiliar para retornar o erro
public class OAuthCustomError implements Serializable{
	private static final long serialVersionUID = 1L;

	private String error;
	
	@JsonProperty("error_description")   //No momento do json é covertido para o nome "error_description"
	private String errorDescription;
	
	public OAuthCustomError(){
		
	}

	public OAuthCustomError(String error, String errorDescription) {
		this.error = error;
		this.errorDescription = errorDescription;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	
	
	
	
	
}
