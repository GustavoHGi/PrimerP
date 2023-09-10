package OmegaUp;
import java.util.Scanner;
import java.util.Arrays;
public class ABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[3];
		numeros[0] = sc.nextInt();
		numeros[1] = sc.nextInt();
		numeros[2] = sc.nextInt();
		String orden = sc.next();
		Arrays.sort(numeros);
		for (int i = 0; i < 3; i++) {
			char c = orden.charAt(i);
			if (c == 'A') {
				System.out.print(numeros[0] + " ");
			} else if (c == 'B') {
				System.out.print(numeros[1] + " ");
			} else if (c == 'C') {
				System.out.print(numeros[2] + " ");
			}
		}
	}
}