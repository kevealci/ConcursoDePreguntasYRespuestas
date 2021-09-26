package test;

import entidades.Opcion;

public class TestOpcion {

	public static void main(String[] args) {

		Opcion opcion1 = new Opcion("Prueba1", true);
		Opcion opcion2 = new Opcion("Prueba2", false);

		System.out.println(opcion1);
		System.out.println(opcion2);

	}
}
