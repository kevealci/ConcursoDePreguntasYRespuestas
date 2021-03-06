package entidades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import util.CrearPreguntas;
import util.CrearPremios;
import util.Estado;

public class Juego {

	private ArrayList<Pregunta> preguntas;
	private ArrayList<Premio> premios;
	private int premioAcumulado;
	private int nivel;
	private int numeroDeRondas;
	private String estadoJuego;
	
	public Juego() {
		preguntas = new ArrayList<Pregunta>();
		premios = new ArrayList<Premio>();
		premioAcumulado = 0;
		nivel = 1;
		numeroDeRondas = 5;
		estadoJuego="";
		iniciarJuego();
	}

	public void menuPrincipal() {
		System.out.println("Bienvenido al Concurso de Preguntas y Respuestas");
		System.out.println("1.- Configurar Juego");
		System.out.println("2.- Iniciar Juego");
		System.out.println("3.- Salir Juego");
		System.out.println("Escoger una opcion:");
	}

	public void configurarJuego() {
		preguntas = CrearPreguntas.obtenerPreguntas();
		premios = CrearPremios.obtenerPremios();
	}

	public void iniciarJuego() {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		boolean terminar = false;
		boolean configurarJuego = false;

		while (opcion != 3) {

			try {
				menuPrincipal();
				opcion = sc.nextInt();
				if (opcion != 1 && opcion != 2 && opcion != 3) {
					System.out.println("\nElegir opcion valida\n");
				}
			} catch (InputMismatchException ime) {
				System.out.println("\n?Cuidado! Solo puedes insertar n?meros.\n");
				sc.next();
			}

			switch (opcion) {
			case 1:
				configurarJuego = true;
				System.out.println("\nJuego Configurado, puede iniciar el juego\n");
				break;
			case 2:
				if (configurarJuego) {
					opcion = 3;
				} else {
					System.out.println("\nSe debe configurar el juego primero!\n");
				}
				break;
			case 3:
				terminar = true;
			}
		}

		if (configurarJuego) {
			configurarJuego();
		}

		if (terminar) {
			System.out.println("Gracias por jugar");
			sc.close();
			return;
		}

		System.out.println("\nJuego iniciado, que te diviertas!");
		
		for(int i = 0; i < numeroDeRondas; i++){
			crearRonda();
			verificarEstadoJuego();
			if(estadoJuego == Estado.PERDIO || estadoJuego == Estado.RETIRO ){
				sc.close();
				return;
			}
		}
	}

	
	public void guardarDatos(){
		File file = null;
		FileWriter archivo = null;
		BufferedWriter bufferedWriter = null;
		PrintWriter salida = null;
		try{
			file = new File("PersistenciaDeDatos/datosHistoricos.txt");
			archivo = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(archivo);
			salida = new PrintWriter(bufferedWriter);
			salida.write("El Jugador acumulo: $"+premioAcumulado+" y "+estadoJuego+"\n");
		}catch(IOException ex){
			System.out.println("Error: "+ex);
		}finally{
			salida.close();
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el BufferedWriter: "+ e);
			}
			try {
				archivo.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el archivo: "+ e);
			}
		}
	}
	
	public void verificarEstadoJuego(){
		if(estadoJuego == Estado.GANO){
			guardarDatos();
			System.out.println("\nHas Ganado!!!, Gracias por participar");
			System.out.println("\nEl Jugador acumulo: $"+premioAcumulado+" y "+estadoJuego);
		}else if(estadoJuego == Estado.PERDIO){
			guardarDatos();
			System.out.println("\nHas perdido, Gracias por participar");
			System.out.println("\nEl Jugador acumulo: $"+premioAcumulado+" y "+estadoJuego);
		}else if(estadoJuego == Estado.RETIRO){
			guardarDatos();
			System.out.println("\nTe has retirado, Gracias por participar");
			System.out.println("\nEl Jugador acumulo: $"+premioAcumulado+" y "+estadoJuego);
		}	
	}
	
	public void crearRonda() {
		Ronda ronda = new Ronda(nivel, premios.get(nivel - 1), preguntas);
		ronda.elegirPregunta();
		System.out.println("\nPregunta de la ronda " + nivel + "\n");
		Opcion opcion = responderPregunta(ronda.getPreguntaElegida());
		if(opcion == null){
			estadoJuego = Estado.RETIRO;
			return;
		}
		if(nivel == 5 && opcion.getValida() == true){
			estadoJuego = Estado.GANO;
			premioAcumulado += premios.get(nivel-1).getDinero();
		}else if(opcion.getValida() == true && nivel !=5){
			premioAcumulado += premios.get(nivel-1).getDinero();
			aumentarNivel();
		}else if(opcion.getValida() == false){
			estadoJuego = Estado.PERDIO;
			premioAcumulado = 0;
		}
	}

	public void aumentarNivel(){
		nivel++;
	}
	
	public Opcion responderPregunta(Pregunta pregunta) {
		Scanner sc1 = new Scanner(System.in);
		int opcion = 0;
		while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
			try {
				menuPregunta(pregunta);
				opcion = sc1.nextInt();
				if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
					System.out.println("\nElegir opcion valida\n");
				}
			} catch (InputMismatchException ime) {
				System.out.println("\n?Cuidado! Solo puedes insertar n?meros.\n");
				sc1.next();
			}
		}
		if(opcion == 5){
			return null;
		}else{
			return pregunta.getOpciones().get(opcion-1);
		}
	}

	public void menuPregunta(Pregunta pregunta) {
		System.out.println(pregunta.getPregunta());
		System.out.println("1.-" + pregunta.getOpciones().get(0));
		System.out.println("2.-" + pregunta.getOpciones().get(1));
		System.out.println("3.-" + pregunta.getOpciones().get(2));
		System.out.println("4.-" + pregunta.getOpciones().get(3));
		System.out.println("5.-Retirarse con: $" + premioAcumulado);
		System.out.println("Escoger una opcion");
	}

}
