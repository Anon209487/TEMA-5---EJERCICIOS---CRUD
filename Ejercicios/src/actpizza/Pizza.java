/**
 * 
 */
package actpizza;

/**
 * 
 */
public class Pizza {
	private String código;
	private String tamayo;
	private String tipo;
	private String estado = "pedida";

	public Pizza() {
	}

	public Pizza(String código, String tamayo, String tipo) {
		this.setCódigo(código);
		this.setTamayo(tamayo);
		this.setTipo(tipo);
	}

	public String getCódigo() {
		return código;
	}

	private void setCódigo(String código) {

		if (código != null && !código.equals("")) {
			this.código = código;
		}
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado != null && !estado.equals("")) {
			this.estado = estado;
		}
	}

	public String getTamayo() {
		return tamayo;
	}

	private void setTamayo(String tamayo) {

		if (tamayo != null && !tipo.equals("")) {
			this.tamayo = tamayo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	private void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}

	}

	public String toString() {
		return "código " + código + " tamayo " + tamayo + " tipo " + tipo + " estado " + estado;

	}

	public boolean equals(Object obj) {
		Pizza PizzaComparacion = (Pizza) obj;
		return this.getCódigo().equals(PizzaComparacion.getCódigo());

	}
}
