/**
 * 
 */
package actpizza;

/**
 * 
 */
public class Pizza {
	private int código;
	private String tamayo;
	private String tipo;
	private static String estado = "pedida";

	public Pizza() {
	}

	public Pizza(int código, String tamayo, String tipo) {
		this.setCódigo(código);
		this.setTamayo(tamayo);
		this.setTipo(tipo);
	}

	public String toString() {
		return "código " + código + " tamayo " + tamayo + " tipo " + tipo + " estado " + estado;

	}

	public double getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {

		Pizza.estado = estado;
	}

	public String getTamayo() {
		return tamayo;
	}

	public void setTamayo(String tamayo) {
		this.tamayo = tamayo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
