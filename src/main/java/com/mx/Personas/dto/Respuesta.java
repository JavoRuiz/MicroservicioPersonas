package com.mx.Personas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Respuesta {
	private String mensaje;
	private boolean succes;
	private Object obj;
	
}
