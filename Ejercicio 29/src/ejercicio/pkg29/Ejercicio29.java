package ejercicio.pkg29;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        
        int num,num2,suma;
        
        suma = 0;
        
        do {
            
            System.out.println("Ingrese 2 numeros: ");
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt(); num2 = entrada.nextInt();
            
            
            suma += num + num2;
            
            
            
        } while (num != 0 || num2 != 0);
        
        System.out.println("La suma es: " + suma);
        
    }
    
}
