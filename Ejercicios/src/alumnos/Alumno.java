package alumnos;

import examenanyoanterior.Empleado;

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
		setNombre(nombre);
		setNotaMedia(notaMedia);

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

	}

	/**
	 * @return the notaMedia
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia > 0) {
			this.notaMedia = notaMedia;
		}

	}

	public String toString() {
		String nombreYNota = " El nombre es : " + this.nombre + " La notaMedia es : " + this.notaMedia;
		return nombreYNota;

	}

	public boolean equals(Object obj) {
		Alumno AlumnoComparacion = (Alumno) obj;
		return this.getNombre().equals(AlumnoComparacion.getNombre());

	}
}