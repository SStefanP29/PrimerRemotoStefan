/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERICICIO41.java."

import java.io.*;
import java.math.*;

public class ejercicio41Error {

	public static void main(String args[]) {
		double acumulador = 0;
		double contador = 0;
		int numero_uno = 0;
		int numnro_uno = 0;
		// datos
		numero_uno = 0;
		acumulador = 0;
		// algoritmo
		for (contador = 0; contador <= 19; contador++) {
			numero_uno = (int) Math.floor(Math.random() * 31);
			if (numero_uno % 5 == 0) {
				acumulador = acumulador + numnro_uno;
			}
		}
		System.out.println("la suma es " + acumulador);
	}

}
