package OmegaUp;
import java.util.Scanner;
public class QuiénTieneMasDinero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1,s2;
		int p1=sc.nextInt();
		int p2=sc.nextInt();
		int p3=sc.nextInt();
		int j1=sc.nextInt();
		int j2=sc.nextInt();
		s1=p1+p2+p3;
		s2=j1+j2;
		if(s1<s2) {
			System.out.println("Pedro");
		}else {
			System.out.println("Juan");
		}
    }
}
