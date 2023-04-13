package com.devsuperior.movieflix.controllers.exceptions;

import java.io.Serializable;

/*
 * Classe utilizada para carregar o nome do campo e mensagem do erro. 
 */

public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * Carrega os campos e a mensagem
	 */

	private String fieldName;
	private String message;

	public FieldMessage() {

	}

	public FieldMessage(String fieldName, String message) {
		super();
		this.fieldName = fieldName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
