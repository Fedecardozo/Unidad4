package ejercicio.pkg7;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        
        Scanner entrada = new Scanner(System.in);
        
        num = entrada.nextInt();
        
        if (num%2 == 0){
            
            System.out.println("El numero es par!!");
        }
        else{

            System.out.println("El numero es impar!!");

        }
        
    }   
    
}
