import java.util.Random;
import java.util.Scanner;

public class Segunda {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("introduce un valor mayor que 5");
		int nextInt = leer.nextInt();
		boolean sigo = true;
		for (int i = 0; i < nextInt && sigo; i++) {
			System.out.println("hola");
			sigo = new Random().nextBoolean();
		}

	}

}
