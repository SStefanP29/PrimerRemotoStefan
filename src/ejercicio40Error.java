/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERCICIO40.java."

import java.io.*;

public class ejercicio40Error {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double contador = 0;
		double numero_uno = 0;
		do {
			System.out.println("introduce un numero natural entre 1 y 9");
			numero_uno = Double.parseDouble(bufEntrada.readLine());
		} while (!(numero_uno > 0 && numero_uno < 10));
		for (contador = 1; contador <= 10; contador += 2) {
			System.out.println(numero_uno + "X" + contador + "=" + numero_uno * contador);
		}
	}

}
