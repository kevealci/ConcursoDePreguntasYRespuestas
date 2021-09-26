package test;

import entidades.Nivel;
import entidades.Pregunta;

public class TestPregunta {

	public static void main(String[] args) {
		
		Pregunta pregunta1 = new Pregunta("Pregunta 1 de prueba");
		
		pregunta1.agregarCategoria("Juego", new Nivel(1));
		pregunta1.agregarOpcion("False", false);
		pregunta1.agregarOpcion("True", true);
		pregunta1.agregarOpcion("False", false);
		pregunta1.agregarOpcion("False", false);
		
		System.out.println(pregunta1);

	}

}
