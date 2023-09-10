package OmegaUp;
import java.util.Scanner;
public class Asteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N <= 20) {
			for (int i = 0; i < N; i++) {
				System.out.print("*");
			}
			System.out.println("");

		} else {
			System.out.println("Error");
		}
	}
}