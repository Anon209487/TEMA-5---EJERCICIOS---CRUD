package alumnos;
 
/**
 * boletin 2 act 1
 */
public class Alumno {
	private String nombre;
	private double notaMedia;
/**
 * 
 */
	public Alumno() {

	}
/**
 * 
 * @param nombre
 * @param notaMedia
 */
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}
	
	public String toString() {
		String nombreYNota = "El nombre es : " + this.nombre+"La notaMedia es : "+this.notaMedia;
		return nombreYNota;

	}
}