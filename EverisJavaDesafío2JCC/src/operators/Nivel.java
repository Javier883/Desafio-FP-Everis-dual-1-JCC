package operators;

import java.util.Scanner;

public class Nivel extends Objeto {

	private int nivel = 1;
	private int altura = 10;
	private int puntuacionMax = 100;

	public Nivel() {
	}

	public void seleccionar_nivel() {

		System.out.println("Seleccione un nivel de los siguientes: ");
		System.out.println("1.(100pt)\n" + "2.(200pt)\n" + "3.(400pt)\n");
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		if (e == 1) {

			setNivel(1);
			setAltura(10);
			setPuntuacionMax(100);

		} else if (e == 2) {

			setNivel(2);
			setAltura(10);
			setPuntuacionMax(200);

		} else if (e == 3) {

			setNivel(3);
			setAltura(10);
			setPuntuacionMax(400);

		} else {
			System.out.println("Eso nunca fue una opción");
		}
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the puntuacionMax
	 */
	public int getPuntuacionMax() {
		return puntuacionMax;
	}

	/**
	 * @param puntuacionMax the puntuacionMax to set
	 */
	public void setPuntuacionMax(int puntuacionMax) {
		this.puntuacionMax = puntuacionMax;
	}

}
