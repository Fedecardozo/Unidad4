package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int area;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese area del cuadrado: ");
        area = entrada.nextInt();
        double raiz = Math.sqrt(area);
        double peri = raiz * 4;
        System.out.println("El perimetro es de: "+ peri);

    }
    
}