package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        final double PI = 3.14;
        int diametro;
        int perimetro;
        
        System.out.println("Ingrese diametro del circulo: ");
        Scanner entrada = new Scanner(System.in);
        diametro = entrada.nextInt();
        
        perimetro = (int) (diametro * PI);
        
        System.out.println("El perimetro es: " + perimetro);
        
    }
    
}
