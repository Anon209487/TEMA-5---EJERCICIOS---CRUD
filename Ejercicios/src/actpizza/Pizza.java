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
			this.tamayo = tamayo;
			this.tipo = tipo;
		}
		private  boolean pedidoservido() {
			this.estado= "pedida";
			boolean pedidios = false;
			return pedidios;
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
		public  void setEstado(String estado) {
		
			Pizza.estado = estado;
		}

	}


