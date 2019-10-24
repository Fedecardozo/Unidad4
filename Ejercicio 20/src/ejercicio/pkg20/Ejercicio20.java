package ejercicio.pkg20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        int num;
        double promedio,suma;
        
        num = numero();
        suma = notas(num);
        promedio = (double) (suma/num);
        System.out.println("El promedio es: " + promedio);
        
    }
    
    static int numero(){

     int s;

     System.out.println("¿Cuantas notas desea ingresar? ");
     Scanner teclado = new Scanner(System.in);
     s = teclado.nextInt();

     return s;

    }
    static double notas(int x){
        
        int s,i,d;
        int v[] = new int[x];
        i=0;
        d=0;
        System.out.println("Ingrese " + x + " notas: ");
        
        do {
            
            Scanner e = new Scanner(System.in);
            s = e.nextInt();
            while(s<1 || s>10){
                
                System.out.println("Error, ingrese nota valida: ");
                s = e.nextInt();
            }
            v[i] = s;
            
            if (i<x - 1) {
                System.out.println("Ingrese siguiente nota: ");
            }
            
            i++;
            
        } while (i<x);
       
        for (int j = 0; j < x; j++) {
            
            d += v[j];
            
        }
        
        return d;
        
    }
   
       
}
