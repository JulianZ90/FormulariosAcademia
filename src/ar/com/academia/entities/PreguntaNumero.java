package ar.com.academia.entities;

import java.util.List;

public class PreguntaNumero implements Pregunta {
	
	private String enunciado;
	private Integer respuestaCorrecta;
	private Integer respuestaUsuario;
	
	public PreguntaNumero(String enunciado, Integer respuestaCorrecta, Integer respuestaUsuario) {
		this.setEnunciado(enunciado);
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaUsuario = respuestaUsuario;
	}
	
	public Integer getRespuestaCorrecta() {
		return respuestaCorrecta;
	}


	public void setRespuestaCorrecta(Integer respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public Integer getRespuestaUsuario() {
		return respuestaUsuario;
	}

	public void setRespuestaUsuario(Integer respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}

	public void responder(Integer respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}
	
	@Override
	public Boolean esCorrecta() {
		if( respuestaUsuario.intValue() == respuestaCorrecta.intValue() ) {
			return true;
		}
		return false;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
}
