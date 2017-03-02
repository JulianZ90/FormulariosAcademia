package ar.com.academia.entities;

import java.util.List;

public class Examen {
	
	private List<Pregunta> preguntas;
	
	private static final Double MINIMO_PREGUNTAS_PARA_APROBAR = 0.6;
	
	public Examen(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	
	public Boolean estaAprobado(){ 
		Integer preguntasCorrectas = 0;
		Integer totalDePreguntas = preguntas.size();
		for( Pregunta pregunta : preguntas ) {
			if( pregunta.esCorrecta() ) {
				preguntasCorrectas++;				
			}
		}
		
		return (preguntasCorrectas > (totalDePreguntas * MINIMO_PREGUNTAS_PARA_APROBAR) );
	};

}
