package ejercicio.pkg21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
       
        int num;
        
        num = numero();
        factorial(num);
        
    }
    
    static int numero(){

     int s;

     System.out.println("Ingrese numero: ");
     Scanner teclado = new Scanner(System.in);
     s = teclado.nextInt();

     return s;

    }
    
    static void factorial(int x){
        
        int y=1;
        
        for (int i = 1; i <= x; i++) {
            
            y *= i;
            
        }
        
         System.out.println("El factorial de " + x +" es: " + y);
         
    }
}
