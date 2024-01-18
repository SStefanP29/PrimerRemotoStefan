/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERCICIO43.java."

import java.io.*;
import java.math.*;

public class ejericcio43Error {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double acumulador;
		double contador;
		int numero_uno;
		int temporal;
		// datos
		numero_uno = 0;
		temporal = 0;
		acumulador = 0;
		// algoritmo
		do {
			System.out.println("introduce un numero natural");
			numero_uno = bufEntrada.hashCode();
		} while (numero_uno <= 0);
		temporal = (int) Math.floor(numero_uno / 2);
		for (contador = temporal; contador >= 2; contador--) {
			if (numero_uno % contador == 0) {
				acumulador = acumulador + contador;
			}
		}
		if (acumulador == numero_uno) {
			System.out.println("el numero " + numero_uno + " SI es perfecto");
		} else {
			System.out.println("el numero " + numero_uno + " NO es perfecto");
		}
	}

}
