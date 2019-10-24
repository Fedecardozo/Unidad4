package ejercicio.pkg23;

import java.util.Scanner;


public class Ejercicio23 {

   
    public static void main(String[] args) {
        
        
        maximoMinimo();
        
        
    }

     static void maximoMinimo(){
         
         int y=0; int s=0;
         int x;
         
         System.out.println("Ingrese numero, para finalizar ingrese 0: ");
         
         do {
             
             Scanner teclado = new Scanner(System.in);
             x = teclado.nextInt();
        
             
             if(x > y){
                 
                 y = x;
                 
             }else if(s < x && x > 0){
                 
                 s = x;
                 
             }
             
             
             
         } while (x != 0);
         
         System.out.println("El maximo es: " + y);
         System.out.println("El minimo es: " + s);
     }
    
}
