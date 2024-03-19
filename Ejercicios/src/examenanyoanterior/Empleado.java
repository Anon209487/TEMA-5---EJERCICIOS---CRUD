/**
 * 
 */
package examenanyoanterior;

/**
 * 
 */
public class Empleado {
	private String nombre;
	private String apellidos;
	private String sexo = "m";

	Empleado() {

	}

	Empleado(String nombre, String apellidos, String sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.setSexo(sexo);
	}

	public String toString() {
		return nombre + apellidos + sexo;

	}

	public boolean equals(Object o) {
		Empleado empleadoComparacion = (Empleado) o;
		return this.getNombre().equals(empleadoComparacion.getNombre());

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}