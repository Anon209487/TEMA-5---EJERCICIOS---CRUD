/**
 * 
 */

package examenanyoactual;

/**
 * Clase que representa al empleado
 */
public class Empleado {
	/**
	 * String con el valor del dni empleado
	 */
	private String dni;
	/**
	 * String con el valor del nombre del empleado
	 */
	private String nombre;
	/**
	 * double con el valor del sueldoBase del empleado
	 */
	private double sueldoBase;
	/**
	 * int con el valor del horasExtra del empleado
	 */
	private int horasExtra;
	/**
	 * double con el valor economico del horasExtra de todos los empleado
	 */
	private static double importeHoraExtra;

	/**
	 * constructor de empleado solo con el DNI
	 * 
	 * @param dni
	 */
	Empleado(String dni) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
	}

	/**
	 * constructor de empleado con todos los atributos
	 * 
	 * @param dni
	 * @param nombre
	 * @param sueldoBase
	 * @param horasExtra
	 */
	Empleado(String dni, String nombre, double sueldoBase, int horasExtra) {
		if (dni != null && !dni.equals("")) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (sueldoBase >= 0) {
			this.sueldoBase = sueldoBase;
		}
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the sueldoBase
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(double sueldoBase) {
		if (sueldoBase >= 0) {
			this.sueldoBase = sueldoBase;
		}

	}

	/**
	 * @return the horasExtra
	 */
	public int getHorasExtra() {
		return horasExtra;
	}

	/**
	 * @param horasExtra the horasExtra to set
	 */
	public void setHorasExtra(int horasExtra) {
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
	}

	/**
	 * @return the importeHoraExtra
	 */
	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	/**
	 * @param importeHoraExtra the importeHoraExtra to set
	 */
	public static void setImporteHoraExtra(double importeHoraExtra) {
		if (importeHoraExtra >= 0) {
			Empleado.importeHoraExtra = importeHoraExtra;
		}

	}

	/**
	 * fucncion que calcula el coplemento de las horas extras
	 * 
	 * @return
	 */
	public double calcularComplemento() {
		return sueldoBase + (horasExtra * importeHoraExtra);
	}

	/**
	 * funciones de la clase toString
	 */
	public String toString() {
		String empleado = "dni: " + dni + "\n";
		empleado += "nombre: " + nombre + "\n";
		empleado += "sueldoBase: " + sueldoBase + " $" + "\n";
		empleado += "horasExtra: " + horasExtra + " horas" + "\n";
		return empleado;
	}

	/**
	 * funcion de la clase equals
	 */
	public boolean equals(Object o) {
		boolean res = false;
		Empleado empleadoComparacion = (Empleado) o;
		if (dni.equals(empleadoComparacion.dni)) {
			res = true;
		}
		return res;
	}
}
