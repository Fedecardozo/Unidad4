package ejercicio.pkg26;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        
        int max=0; int min=9999;
         int num;
         
         System.out.println("Ingrese numero, para finalizar ingrese 0: ");
         Scanner teclado = new Scanner(System.in);
         num = teclado.nextInt();
             
         while(num != 0){
        
             if(num > max){
                 
                 max = num;
                 
             }if(num < min){
                 
                 min = num;
                 
             }
             
             num = teclado.nextInt();
             
         } 
         
         System.out.println("El maximo es: " + max);
         System.out.println("El minimo es: " + min);
        
        
    }
    
}
