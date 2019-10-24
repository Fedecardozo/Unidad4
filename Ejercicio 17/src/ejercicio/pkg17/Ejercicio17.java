package ejercicio.pkg17;

import java.util.Scanner;

public class Ejercicio17 {

    
    public static void main(String[] args) {
        
          int num;
        
       
        num = numero();
        siguientesFor(num);
       
    }
    
    static int numero(){
        
        int s;
        
        System.out.println("Ingrese numero: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextInt();
        
        return s;
        
    }
   
    static void siguientesFor(int x){
        
        
        for (int i=1; i<11 ; i++){
          
            
            System.out.print(x * i + " ");
            
        }  
        
        System.out.println(" ");
        
    }

    
}
