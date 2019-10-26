package ejercicio.pkg27;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        
        double sueldo,total;
        int i=1;
        String mes;
        
        total = 0;
        
        do {
            
            mes = meses(i);
            System.out.println("Ingrese sueldo del mes de " + mes +": ");
            Scanner entrada = new Scanner(System.in);
            sueldo = entrada.nextDouble();
            
            if(sueldo >= 0){
                
                total += sueldo;
                
            }
            
            i++;
            
            
        } while (i<=12 && sueldo>=0);
        
        DecimalFormat DF = new DecimalFormat("###,###.00");
            
        System.out.println("El sueldo total es de: $" + DF.format(total));
    }
    
    static String meses(int x){
        
        String m = " ";
        
        switch(x){
            
            case 1:
                m = ("Enero");
                break;
            case 2:
                m = ("Febrero");
                break;
            case 3:
                m = ("Marzo");
                break;
            case 4:
                m = ("Abril");
                break;
            case 5:
                m = ("Mayo");
                break;
            case 6:
                m = ("Junio");
                break;
            case 7:
                m = ("Julio");
                break;
            case 8:
                m = ("Agosto");
                break;
            case 9:
                m = ("Septiembre");
                break;
            case 10:
                m = ("Octubre");
                break;
            case 11:
                m = ("Noviembre");
                break;
            case 12:
                m = ("Diciembre");
                break;    
                
        }
        
        return m;
        
    }
    
}
