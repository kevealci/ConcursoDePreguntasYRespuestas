package entidades;

public class Premio {
	
	private int dinero;

	/**
	 * @param dinero
	 */
	public Premio(int dinero) {
		this.dinero = dinero;
	}

	/**
	 * @return the dinero
	 */
	public int getDinero() {
		return dinero;
	}

	/**
	 * @param dinero the dinero to set
	 */
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Premio [dinero=" + dinero + "]";
	}
	
	

}
