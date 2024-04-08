/**
 * 
 */
package examenanyoanterior;

/**
 * 
 */
public class Empleado {

	private String nombre = "";
	private String apellidos = "";
	private String sexo = "masculino";

	public Empleado() {

	}

	public Empleado(String nombre, String apellidos) {
		setNombre(nombre);
		setApellidos(apellidos);

	}

	public Empleado(String nombre, String apellidos, String sexo) {
		setNombre(nombre);
		setApellidos(apellidos);
		setSexo(sexo);
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

	}

	/**
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {

		if (apellidos != null && !apellidos.equals("")) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo) {

		if (sexo != null && !sexo.equals("")) {
			this.sexo = sexo;
		}
	}

	/**
	 * 
	 */
	public String toString() {
		return " nombre: " + apellidos + " apellidos: " + nombre + " sexo: " + sexo;

	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		Empleado empleadoComparacion = (Empleado) obj;
		return this.getNombre().equals(empleadoComparacion.getNombre())
				&& this.getApellidos().equals(empleadoComparacion.getNombre());

	}

}