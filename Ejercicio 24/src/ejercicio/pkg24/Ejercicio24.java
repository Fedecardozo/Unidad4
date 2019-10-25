package ejercicio.pkg24;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        
        int i=-1;
        double peso,total,promedio;
        total = 0;
        
        System.out.println("Para finalizar ingrese 0");
        System.out.println("Ingrese peso de los alumnos: ");
        
        do {
             
            Scanner entrada = new Scanner(System.in);
            peso = entrada.nextDouble();
            total += peso;
            i++; 
            
        } while (peso != 0);
        
        promedio = total/i;
        DecimalFormat DF = new DecimalFormat("###,###.00");
            
        //System.out.println("Promedio normal: " + promedio);
        System.out.println("El promedio de peso es: " + DF.format(promedio));
        
    }
    
    
    
}
