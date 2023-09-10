package OmegaUp;
import java.util.Scanner;
public class EscaleraDeAsteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if (N <= 15) {

			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= j; k++) {
					System.out.print("#");
				}
				System.out.println();
			}
		} else {
			System.out.print("Error");
		}

	}
}
