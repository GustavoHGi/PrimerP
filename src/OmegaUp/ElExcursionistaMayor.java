package OmegaUp;
import java.util.Scanner;
public class ElExcursionistaMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int edadMaxima = 0;
        for (int i = 0; i < n; i++) {
            int edad = sc.nextInt();
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }
        System.out.println(edadMaxima);
    }
}