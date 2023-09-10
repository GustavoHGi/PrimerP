package OmegaUp;
import java.util.Scanner;
public class PerímetroDeAsteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		if (h <= 100 && w <= 100) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
						System.out.print("* ");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Error");
		}
	}
}