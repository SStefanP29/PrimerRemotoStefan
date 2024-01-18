import java.util.Scanner;

public class Primera {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("introduce un valor mayor que 5");
		int nextInt = leer.nextInt();
		if (nextInt > 5) {
			System.out.println("muy bien es mayor");
		} else

		{
			System.out.println("pero que te he dicho?");
		}
	}
}
