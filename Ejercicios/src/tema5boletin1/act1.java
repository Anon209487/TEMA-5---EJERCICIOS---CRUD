/**
 * 
 */
package tema5boletin1;
 
/**
 * 
 */
public class act1 {


	public class Libro {
		private String título;
		private String autor;
		private int ejemplares;
		private int prestados;
		public Libro() {
		}
		public Libro(String título2, String autor2, int ejemplares2, int prestados2) {
			this.título=título2;
			this.autor=autor2;
			this.ejemplares =ejemplares2;
			this.prestados=prestados2;
		}
		public boolean prestamo() {
			boolean prestar = true;
			if (this.ejemplares == 0) {
				prestar = false;
			} else {
				this.ejemplares--;
				this.prestados++;
			}
			return prestar;
		}
		public boolean devolucion() {
			boolean prestar = true;
			if (this.prestados == 0) {
				prestar = false;
			} else {
				this.ejemplares++;
				this.prestados--;
			}
			return prestar;
		}
		public void mostrarDatod() {
			String mostrarDatoS = this.título + this.autor + this.ejemplares + this.prestados;
			System.out.print(mostrarDatoS);
		}
	}
}

