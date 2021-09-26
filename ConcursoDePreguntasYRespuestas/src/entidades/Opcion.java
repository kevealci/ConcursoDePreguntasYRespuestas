package entidades;

public class Opcion {
	
	private String opcion;
	private boolean valida;
	
	/**
	 * @param opcion
	 * @param valida
	 */
	public Opcion(String opcion, boolean valida) {
		this.opcion = opcion;
		this.valida = valida;
	}

	/**
	 * @return the opcion
	 */
	public String getOpcion() {
		return opcion;
	}

	/**
	 * @param opcion the opcion to set
	 */
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	/**
	 * @return the valida
	 */
	public boolean getValida() {
		return valida;
	}

	/**
	 * @param valida the valida to set
	 */
	public void setValida(boolean valida) {
		this.valida = valida;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return opcion;
	}
	
	
	
	
	
}
