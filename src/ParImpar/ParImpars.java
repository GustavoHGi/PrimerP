package ParImpar;
import java.util.Scanner;
public class ParImpars {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s1=in.nextInt();
		int s2=in.nextInt();
		int Sum=s1+s2;
		int N=Sum%2;
		
		if(N>0) {
			System.out.println("Impar :"+Sum);
		}else {
			System.out.println("Par :"+Sum);
		}
		

	}

}
