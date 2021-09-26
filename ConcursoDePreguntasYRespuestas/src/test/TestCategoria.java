package test;

import entidades.Categoria;
import entidades.Nivel;

public class TestCategoria {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria("Juego", new Nivel(1));
		Categoria categoria2 = new Categoria("Historia", new Nivel(2));
		Categoria categoria3 = new Categoria("Arte", new Nivel(3));
		Categoria categoria4 = new Categoria("Musica", new Nivel(4));
		Categoria categoria5 = new Categoria("Cine", new Nivel(5));
		
		System.out.println(categoria1);
		System.out.println(categoria2);
		System.out.println(categoria3);
		System.out.println(categoria4);
		System.out.println(categoria5);
		
	}

}
