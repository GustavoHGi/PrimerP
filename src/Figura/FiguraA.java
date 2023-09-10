package Figura;
import java.util.Scanner;
public class FiguraA {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Cuadro");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("Triangulo");
        
        int num = in.nextInt();
        for(int altt= 1; altt<=num; altt++){
        for(int nunc = 1; nunc<=-altt; nunc++){
         System.out.print(" ");
         }
        for(int larg=1; larg<=(altt*2)-1; larg++){
         System.out.print("*");
         }
         System.out.println(" ");
        }
        System.out.println("Rombo");
        
        boolean numeroCorrecto = false;
        int numFilasRombos; 
        do {
            System.out.print("Introduce la altura: ");
            numFilasRombos = in.nextInt();
            if(numFilasRombos>0 ){
                numeroCorrecto = true;
            }
        } while (!numeroCorrecto);
         
        System.out.println(" ");
         
        int numFilas = numFilasRombos/2 + 3;
                 
        for(int altura=1;altura<=numFilas;altura++){
            for(int blancos=1;blancos<=numFilas-altura;blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
                System.out.print("*");
            }
            System.out.println(" ");         
        }
        numFilas--;
         
        for(int altura=1;altura<=numFilas;altura++){
            
            for(int blancos=1;blancos<=altura;blancos++){
                System.out.print(" ");
            }
            
            for(int asteriscos=1;asteriscos<=(numFilas-altura)*2 +1;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
