package test;

import java.util.ArrayList;

import entidades.Pregunta;
import entidades.Premio;
import entidades.Ronda;
import util.CrearPreguntas;
import util.CrearPremios;

public class TestRonda {

	public static void main(String[] args) {

		int ronda1 = 1;
		Premio premio = CrearPremios.obtenerPremios().get(0);
		ArrayList<Pregunta> preguntas = CrearPreguntas.obtenerPreguntas();

		Ronda ronda = new Ronda(ronda1, premio, preguntas);

		ronda.elegirPregunta();
		System.out.println(ronda.getPreguntaElegida());
		System.out.println(ronda);

	}

}
