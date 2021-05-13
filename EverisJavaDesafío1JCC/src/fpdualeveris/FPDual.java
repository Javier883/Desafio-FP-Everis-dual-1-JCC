package fpdualeveris;

import variables.Developer;

/**
 * Clase main con el m�todo pedido
 * 
 * @author Campos
 *
 */

public class FPDual {
	/**
	 * Par�metro contador para mantener el control del total de empleados
	 */
	private static int cont;

	private static void variablesChallenge() {
		cont++;

		if (cont > 127) {
			System.out.println("No es posible generar mas empleados");
		} else {
			// Instancia de los 4 empleados
			Developer d1 = new Developer("nombre1");
			Developer d2 = new Developer("nombre2");
			Developer d3 = new Developer("nombre3");
			Developer d4 = new Developer("nombre4");

			// Control del n�mero total de empleados
			System.out.println("N�mero total de empleados: " + Developer.getCont());
			System.out.println("N�mero total desde empleado 1: " + d1.getCont());
			System.out.println("N�mero total desde empleado 4: " + d4.getCont());

			// Control de los d�as de vacaciones de cada empleados
			d2.getVacaciones();
			d2.setVacaciones(2);
			System.out.println("Empleado 1: " + d1.getVacaciones() + "\n" + "Empleado 2: " + d2.getVacaciones() + "\n"
					+ "Empleado 3: " + d3.getVacaciones() + "\n" + "Empleado 4: " + d4.getVacaciones());

			// Informaci�n de cada empleado
			System.out.println(d1.toString() + "\n" + d2.toString() + "\n" + d3.toString() + "\n" + d4.toString());

		}

	}

	public static void main(String[] args) {
		// Llamada al m�todo variablesChallenge()
		variablesChallenge();
	}

}
		
	
    
		

	


