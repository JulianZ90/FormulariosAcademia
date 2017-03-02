package ar.com.academia;

import java.util.ArrayList;
import java.util.List;

import ar.com.academia.entities.Examen;
import ar.com.academia.entities.Pregunta;
import ar.com.academia.entities.PreguntaNumero;
import ar.com.academia.entities.PreguntaPalabra;
import ar.com.academia.entities.PreguntaSeleccionable;

public class MainApp {

	public static void main(String args[]) {
		//Creo Examen INIC
		List<Examen> examenes = new ArrayList<>();
		
		Pregunta pregNumero = new PreguntaNumero("Sqrt 9", 3, 3);
		Pregunta pregPalabra = new PreguntaPalabra("Estamos en el mes de Febrero", "Si", "Si");
		
		List<String> respuestas = new ArrayList<>();
		respuestas.add("Obama");
		respuestas.add("Clinton");
		respuestas.add("Trump");
		Pregunta pregChoice = new PreguntaSeleccionable("Presidente de Estados Unidos", respuestas, "Obama", "Trump");
		
		List<Pregunta> preguntas = new ArrayList<>();
		preguntas.add(pregNumero);
		preguntas.add(pregPalabra);
		preguntas.add(pregChoice);
		
		Examen examen = new Examen(preguntas);
		// Creo Examen FIN
		
		System.out.println( examen.estaAprobado() ); 
		for(Pregunta pregunta : examen.getPreguntas()){
			System.out.println(pregunta.getEnunciado() + " esta correcta?  " + pregunta.esCorrecta());
		}
		
	}

	
}
