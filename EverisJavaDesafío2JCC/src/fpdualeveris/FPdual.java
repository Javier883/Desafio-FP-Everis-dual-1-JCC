package fpdualeveris;

import operators.Pinball;

/**
 * Clase main para llamar al método menú
 * 
 * @author Campos
 *
 */
public class FPdual {

	public static void main(String[] args) {
		Pinball pb = new Pinball();

		// Instance of chorra que te deja llamar al método siempre y cuando pb sea un
		// objeto instanciado de la clase Pinball

		if (pb instanceof Pinball) {

			pb.menu();
		}

	}

}
