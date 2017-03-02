package ar.com.academia.entities;

import java.util.List;

public class PreguntaSeleccionable implements Pregunta {

	private String enunciado;
	private List<String> opcionesDeRespuesta;
	private String respuestaUsuario;
	public List<String> getOpcionesDeRespuesta() {
		return opcionesDeRespuesta;
	}

	public void setOpcionesDeRespuesta(List<String> opcionesDeRespuesta) {
		this.opcionesDeRespuesta = opcionesDeRespuesta;
	}

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

	private String respuestaCorrecta;
	
	public PreguntaSeleccionable(String enunciado, List<String> opcionesDeRespuesta, 
			String respuestaCorrecta, String respuestaUsuario) {
		this.setEnunciado(enunciado);
		this.opcionesDeRespuesta = opcionesDeRespuesta;
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaUsuario = respuestaUsuario;
	}
	
	public void responder(String respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}
	
	@Override
	public Boolean esCorrecta() {
		return  respuestaUsuario.equals(respuestaCorrecta);
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
}
