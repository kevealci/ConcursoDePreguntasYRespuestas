package entidades;

public class Categoria {
	
	private String categoria;
	private Nivel nivel;
	
	/**
	 * @param categoria
	 * @param nivel
	 */
	public Categoria(String categoria, Nivel nivel) {
		this.categoria = categoria;
		this.nivel = nivel;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the nivel
	 */
	public Nivel getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categoria [categoria=" + categoria + ", nivel=" + nivel + "]";
	}
	
	
	
	
	
	
}
