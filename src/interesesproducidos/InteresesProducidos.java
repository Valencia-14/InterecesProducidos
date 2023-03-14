package interesesproducidos;
import java.util.Scanner;

public class InteresesProducidos {
 
    public static void main(String[] args) {
       
       float capInicial, Interes, Interestotal, capFinal;
       int dias;
       
       Scanner sn= new Scanner(System.in);
       
       System.out.println("Introduce el capital a invertir: ");
       capInicial=sn.nextFloat();
       System.out.println("Introduce el Interes (%): ");
       Interes=sn.nextFloat();
       System.out.println("Introduce el numero de dias a invertir: ");
       dias=sn.nextInt();
       Interestotal= (capInicial*Interes*dias)/36000;
       capFinal= Interestotal + capInicial;
       System.out.println("El Capital Final sera: " + capFinal);
       System.out.println("El Interes Generado es: " + Interestotal);
    }
    
}
