/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERCICIO42.java."

import java.io.*;

public class ejercicio42Error {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double acumulador;
		double contador;
		double numero_uno;
		// datos
		numero_uno = 0;
		acumulador = 0;
		contador = 0;
		do {
			System.out.println("escribe un valor o 999 para salir");
			numero_uno = Double.parseDouble(bufEntrada.readLine());
			contador = contador + 1;
			acumulador = acumulador + contador;
		} while (numero_uno != 999);
	}

}
