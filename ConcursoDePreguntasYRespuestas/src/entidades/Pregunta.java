package entidades;

import java.util.ArrayList;

public class Pregunta {

	private String pregunta;
	private Categoria categoria;
	private ArrayList<Opcion> opciones;

	/**
	 * @param pregunta
	 */
	public Pregunta(String pregunta) {
		opciones = new ArrayList<Opcion>();
		this.pregunta = pregunta;
	}

	public void agregarCategoria(String categoria, Nivel nivel) {
		this.categoria = new Categoria(categoria, nivel);
	}

	public void agregarOpcion( String opcion,boolean valida) {
		opciones.add(new Opcion(opcion, valida));
	}

	/**
	 * @return the pregunta
	 */
	public String getPregunta() {
		return pregunta;
	}

	/**
	 * @param pregunta the pregunta to set
	 */
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the opciones
	 */
	public ArrayList<Opcion> getOpciones() {
		return opciones;
	}

	/**
	 * @param opciones the opciones to set
	 */
	public void setOpciones(ArrayList<Opcion> opciones) {
		this.opciones = opciones;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pregunta [pregunta=" + pregunta + ", categoria=" + categoria + ", opciones=" + opciones + "]";
	}
	
	

}
