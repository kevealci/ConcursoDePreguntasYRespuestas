package util;

import java.util.ArrayList;

import entidades.Premio;

public class CrearPremios {
	
	public static ArrayList<Premio> obtenerPremios(){
		ArrayList<Premio> premios = new ArrayList<Premio>();
		premios.add(new Premio(100));
		premios.add(new Premio(1000));
		premios.add(new Premio(10000));
		premios.add(new Premio(10000));
		premios.add(new Premio(100000));
		return premios;
	}

}
