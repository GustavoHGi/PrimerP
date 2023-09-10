package OmegaUp;
import java.util.Scanner;
public class DFDMayoríaDeEdad {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int edad=in.nextInt();
		String msj=(edad>=18)?"MAYOR DE EDAD":"MENOR DE EDAD";
		System.out.println(msj);

		}

	}