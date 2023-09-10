package OmegaUp;
import java.util.Scanner;
public class Comparaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println("mayor");
		}else if(n1==n2) {
			System.out.println("iguales");
		}else {
			System.out.println("menor");
		}
    }
}
