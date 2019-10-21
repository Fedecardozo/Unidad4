package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        final double PI = Math.PI;
        int radio;
        double perimetro,superficie,piDoble;
        
        System.out.println("Ingrese radio de un circulo: ");
        Scanner entrada = new Scanner(System.in);
        radio = entrada.nextInt();
        
        piDoble = 2 * PI;
        superficie = (double) (radio * radio * PI);
        perimetro = (double) (radio * piDoble) ;
        
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("La superficie es: " + superficie);
        
    }
    
}
