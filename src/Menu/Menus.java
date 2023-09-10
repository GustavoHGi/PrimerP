package Menu;
import java.util.Scanner;
public class Menus {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int opcion=0;
	    do{
	        System.out.println("1.hola mundo ");
	        System.out.println("2.mayor edad ");
	        System.out.println("3. suma ");
	        System.out.println("4. Linea ");
	        System.out.println("5. Cuadro ");
	        System.out.println("6. Triangulo ");
	        System.out.println("7. Rectangulo ");
	        System.out.println("8. cuadro2 ");
	        System.out.println("9. Rombo");
	        System.out.println("10. Salir");
	        System.out.println("elige opcion ");
	        opcion=in.nextInt();
	    switch (opcion){
	        case 1:
	        System.out.print("hola mundo. ");
	        break;
	        case 2:
	        System.out.print("mayor de edad ");
	        break;
	        case 3:
	        System.out.print("suma ");
	        System.out.println("Ingresa el primer Numero");
	        int a=in.nextInt();
	        System.out.println("Ingresa el segundo Numero");
	        int b=in.nextInt();
	        int Suma = a+b;
	        System.out.println(Suma);
	        break;
	        case 4:
	        System.out.println("Linea");
	        int n=in.nextInt();
	        for(int i=0;i<n;i++){
	            System.out.print("*");
	        }
	        System.out.println("");
	        
	        break;
	        case 5:
	        System.out.println("Cuadro");
	        n=in.nextInt();
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                System.out.print("* ");
	            }
	            System.out.println("");
	        }
	        break;
	        case 6:
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
	        break;
	        case 7:
	        System.out.println("Rectangulo");
	        a=in.nextInt();
	        b=in.nextInt();
	        for(int i=1;i<=a;i++){
	            for(int j=1;j<=b;j++){
	                System.out.print("* ");
	            }
	            System.out.println("");
	        }
	        break;
	        case 8: 
	        System.out.println("Cuadro2");
	        n=in.nextInt();
	        for (int i = 1; i <= n; i++) {
	          for (int j = 1; j <= n; j++) {
	           if (i == 1 || i == n || j == 1 || j == n) {
	            System.out.print("*");
	           } else {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	        break;
	        
	        case 9:
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
	        break;
	        case 10:
	        System.out.print("adios ");
	        break;
	        
	        default:
	        System.out.print("opcionbno valida ");
	        break;
	    }
	    }while (opcion!=10);
	    System.out.print("hasta la vista baby");
	}
	}