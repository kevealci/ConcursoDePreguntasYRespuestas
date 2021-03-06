package entidades;

import java.util.ArrayList;

import util.Posicion;

public class Ronda {
	
	private int ronda;
	private Premio premio;
	private ArrayList<Pregunta> preguntas;
	private Pregunta preguntaElegida;
	
	/**
	 * @param ronda
	 * @param premio
	 * @param preguntas
	 */
	public Ronda(int ronda, Premio premio, ArrayList<Pregunta> preguntas) {
		this.ronda = ronda;
		this.premio = premio;
		this.preguntas = preguntas;
	}
	
	public void elegirPregunta(){
		ArrayList<Pregunta> auxiliarPreguntas = new ArrayList<Pregunta>();
		
		for(Pregunta pregunta: preguntas){
			if(pregunta.getCategoria().getNivel().getNivel() == ronda){
				auxiliarPreguntas.add(pregunta);
			}
		}
		preguntaElegida = auxiliarPreguntas.get(Posicion.obtenerPosicion());
	}

	/**
	 * @return the ronda
	 */
	public int getRonda() {
		return ronda;
	}

	/**
	 * @param ronda the ronda to set
	 */
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	/**
	 * @return the premio
	 */
	public Premio getPremio() {
		return premio;
	}

	/**
	 * @param premio the premio to set
	 */
	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	/**
	 * @return the preguntas
	 */
	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	/**
	 * @param preguntas the preguntas to set
	 */
	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	/**
	 * @return the preguntaElegida
	 */
	public Pregunta getPreguntaElegida() {
		return preguntaElegida;
	}

	/**
	 * @param preguntaElegida the preguntaElegida to set
	 */
	public void setPreguntaElegida(Pregunta preguntaElegida) {
		this.preguntaElegida = preguntaElegida;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ronda [ronda=" + ronda + ", premio=" + premio + ", preguntas=" + preguntas + ", preguntaElegida="
				+ preguntaElegida + "]";
	}
	
	
	
	
}
