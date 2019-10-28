package ejercicio.pkg30;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
       
        double num,num2;
        double division;
        
        System.out.println("Ingrese 2 numeros: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextDouble(); num2 = entrada.nextDouble();
        
        while(num2 == 0){
            
            System.out.println("Error, ingrese nuevamente: ");
            num2 = entrada.nextInt();
            
        }
        
        division = num / num2;
        
        System.out.println("La division es: " + division);
        
        
    }
    
}
