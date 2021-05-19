package operators;

import java.util.Scanner;

/**
 * Clase bola (Por defectos valores del Betis)
 * 
 * @author Campos
 *
 */
public class Bola_equipo extends Objeto {

	/**
	 * @param equipo
	 * @param color
	 */
	private String equipo = "Betis";
	private String color = "Verde";

	public Bola_equipo() {
	}

	/**
	 * Método mediante el cual seleccionas un equipo y se asigana el color
	 * correspondiente
	 */

	public void seleccionar_equipo() {

		System.out.println("Seleccione un equipo de los siguientes: ");
		System.out.println("1.Betis\n" + "2.Sevilla\n" + "3.Cádiz\n" + "4.Madrid\n");
		Scanner sc = new Scanner(System.in);

		// Estructura IF / ELSE IF / ELSE para elegir el equipo tras recivir un valor
		// por teclado
		int e = sc.nextInt();
		if (e == 1) {

			setEquipo("Betis");
			setColor("Verde");
			System.out.println("Equipo: " + equipo + "\n" + "Color bola: " + color);

		} else if (e == 2) {

			setEquipo("Sevilla");
			setColor("Rojo");
			System.out.println("Equipo: " + equipo + "\n" + "Color bola: " + color);

		} else if (e == 3) {

			setEquipo("Cádiz");
			setColor("Amarillo");
			System.out.println("Equipo: " + equipo + "\n" + "Color bola: " + color);

		} else if (e == 4) {

			setEquipo("Madrid");
			setColor("Blanco");
			System.out.println("Equipo: " + equipo + "\n" + "Color bola: " + color);

		} else {
			System.out.println("Eso nunca fue una opción");
		}
	}

	/**
	 * @return the equipo
	 */
	public String getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
