package OmegaUp;
import java.util.Scanner;
public class AcontarLápices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < N; i++) {
            int numero = sc.nextInt();
            while (numero > 0) {
                if (numero % 10 == K) {
                    contador++;
                }
                numero /= 10;
            }
        }
        System.out.println(contador);
    }
}