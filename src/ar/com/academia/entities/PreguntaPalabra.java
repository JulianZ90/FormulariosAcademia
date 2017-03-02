package ar.com.academia.entities;

public class PreguntaPalabra implements Pregunta  {

	private String enunciado;
	private String respuestaUsuario;
	private String respuestaCorrecta;
	
	public String getRespuestaUsuario() {
		return respuestaUsuario;
	}

	public void setRespuestaUsuario(String respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}

	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	
	
	public PreguntaPalabra(String enunciado, String respuestaCorrecta, String respuestaUsuario) {
		this.setEnunciado(enunciado);
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaUsuario = respuestaUsuario;
	}
	
	public void responder(String respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}
	
	@Override
	public Boolean esCorrecta() {
		if( respuestaUsuario.equals( respuestaCorrecta ) ) {
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
