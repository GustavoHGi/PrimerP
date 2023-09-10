package OmegaUp;
import java.util.Scanner;
public class ElReyCaprichoso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        int maxMCD = 0;
        int maxMCM = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int mcd = mcd(numeros[i], numeros[j]);
                int mcm = numeros[i] * numeros[j] / mcd;
                if (mcd > maxMCD || (mcd == maxMCD && mcm > maxMCM)) {
                    maxMCD = mcd;
                    maxMCM = mcm;
                }
            }
        }
        System.out.println(maxMCM);
    }

    public static int mcd(int a, int b) {
        return b == 0 ? a : mcd(b, a % b);
    }
}