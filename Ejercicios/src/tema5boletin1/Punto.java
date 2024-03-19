/**
 * 
 */
package tema5boletin1;

/**
 * 
 */

	public class Punto {
		   private int x;
		   private int y;
		   public Punto(int x, int y) {
		       this.x = x;
		       this.y = y;
		   }
		   public void imprime() {
		       System.out.println("(" + x + ", " + y + ")");
		   }
		   public void setXY(int x, int y) {
		       this.x = x;
		       this.y = y;
		   }
		   public void desplaza(int dx, int dy) {
		       this.x += dx;
		       this.y += dy;
		   }
		   public double distancia(Punto p) {
		       int dx = this.x - p.x;
		       int dy = this.y - p.y;
		       return Math.sqrt(dx*dx + dy*dy);
		   }
		}




