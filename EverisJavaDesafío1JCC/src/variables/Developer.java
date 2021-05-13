package variables;

/**
 * Clase Developer
 * 
 * @author Campos
 *
 */

public class Developer {

	// PAR�METROS

	/**
	 * @param empresa
	 * @param nombre
	 * @param cont
	 * @param codigo
	 * @param vacaciones
	 */
	private static String empresa = "EVERIS";
	private String nombre;
	private static int cont = 0;
	private int codigo;
	private int vacaciones = 21;
	
	//CONSTRUCTOR

	public Developer(String nombre) {
		this.nombre=nombre;
		this.codigo = cont++;
		codigo++;
	}
	
	//M�TODOS

	/**
	 * M�todo getter para las vacaciones
	 * 
	 * @return the vacaciones
	 */
	public int getVacaciones() {
		return vacaciones;
	}

	/**
	 * M�todo setter para vacaciones
	 * 
	 * @param vacaciones the vacaciones to set
	 */
	public void setVacaciones(int vacaciones) {
		if(vacaciones>21 | this.vacaciones<vacaciones) {
		System.out.println("No tiene tantos dias de vacaciones");
		}else {
			this.vacaciones -= vacaciones;
		}
	}

	/**
	 * M�todo getter para el nombre
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo getter para el contador de empleados
	 * 
	 * @return the cont
	 */
	public static int getCont() {
		return cont;
	}

	/**
	 * M�todo stter para el nombre
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Developer [nombre=" + nombre + ", codigo=" + codigo + ", vacaciones=" + vacaciones + "]";
	}

}
