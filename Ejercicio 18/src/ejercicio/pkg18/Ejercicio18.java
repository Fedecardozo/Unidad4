package ejercicio.pkg18;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        int num;
        
        num = numero();
        mientras(num);
        
    }
    
     static int numero(){
        
        int s;
        
        System.out.println("Ingrese numero: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextInt();
        
        return s;
        
    }
     static void mientras(int x){
         
         int i;
         
         i=0;
         
         while(i<10){
             
             i++;
             System.out.print(x * i + " ");
             
         }
               
         System.out.println(" ");
         
     }
    
}
