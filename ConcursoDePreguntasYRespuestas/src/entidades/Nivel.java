package entidades;

public class Nivel {
	
	private int nivel;

	/**
	 * @param nivel
	 */
	public Nivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nivel [nivel=" + nivel + "]";
	}
	
	

}
