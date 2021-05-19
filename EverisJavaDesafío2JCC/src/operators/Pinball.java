package operators;

import java.util.Scanner;

/**
 * Clase pinball en la cual se desarrolla el menú principal y el algoritmo de
 * juego.
 * 
 * @author Campos
 *
 */
public class Pinball {

	public Pinball() {
	}

	/**
	 * Método menú donde podrás elegir si quieres cambiar el equipo, el nivel o
	 * jugar del tirón
	 */

	public void menu() {

		int vidas = 5;

		int pt = 0;

		int i = 0;

		int x = 2;

		Scanner sc = new Scanner(System.in);

		Nivel n = new Nivel();

		Bola_equipo b = new Bola_equipo();
		boolean repetir = true;
		do {

			System.out.println("Seleccione una opción:");
			System.out.println("");

			System.out.println("1.Jugar\n" + "2.Seleccionar equipo\n" + "3.Seleccionar nivel (Nivel 1 por defecto)\n"
					+ "0.Salir\n");
			System.out.println("");

			String opcion = sc.nextLine();

			switch (opcion) {
			// Caso 1 con un algoritmo basado en tiradas ficticias de dados de 6 y 10 caras
			// para calcular la puntuación
			case "1":
				while (pt < n.getPuntuacionMax() && vidas > 0) {
					int pta;
					System.out.println("");
					System.out.println(
							"Tirando dado para saber si se le da o no a la bola(es necesario tener más de un 1)(D6)");
					System.out.println("");
					int GB = (int) (Math.random() * (6 - 1));
					if (GB >= 2) {
						int G = (int) (Math.random() * (10 - 1));
						if (G == 1) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +1 * nv1;

						} else if (G == 2) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +2 * nv1;

						} else if (G == 3) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +3 * nv1;

						} else if (G == 4) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +4 * nv1;

						} else if (G == 5) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +5 * nv1;

						} else if (G == 6) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +6 * nv1;

						} else if (G == 7) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +7 * nv1;

						} else if (G == 8) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +8 * nv1;

						} else if (G == 9) {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +9 * nv1;

						} else {
							int nv1 = (int) (Math.random() * (10 - 1));
							pta = +10 * nv1;
						}

						pt += pta;
						System.out.println("");
						System.out.println("Puntuación conseguida en esta tirada= " + pta);
						System.out.println("");
						System.out.println("Puntución total= " + pt);
						System.out.println("");

						// Bucle FOR que te dará una vida extra si en la tirada sacas más de un 20
						for (i = 1; i < x; i++) {
							if (pta > 20) {
								vidas++;
								System.out.println("Vida extra for you: " + vidas);
							}
						}

					} else {
						vidas--;
						System.out.println("Has perdido una vida máquina, te quedan: " + vidas);
					}
				}

				vidas = 5;
				pt = 0;

				// Filtro IF que basandose en el porqué se salio del bucle te dirá si has ganado
				// o perdido

				if (vidas == 0) {
					System.err.println("Acabas de perder sin tener que hacer nada, que monstruo");
				} else {
					System.err.println("Acabas de ganar sin hacer nada... Muy bien , muuuuy bien (Sacárstico)");
				}

				break;
			case "2":
				// Caso 2 que llama al método cambiar equipo
				b.seleccionar_equipo();
				break;
			case "3":
				// Caso 3 que llama al método seleccionar nivel
				n.seleccionar_nivel();
				break;
			// Caso 0 que cierra el programa
			case "0":

				System.exit(0);

				break;

			}
		} while (repetir);
	}

}
