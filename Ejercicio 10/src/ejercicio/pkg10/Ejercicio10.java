package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        int num1,num2;
        String msj,msj2;
        
        msj = "Ingrese numero entre 0 y 100: ";
        msj2 = "Ingrese siguiente numero entre 0 y 100: ";
        
        num1 = entre0y100(msj);
        num2 = entre0y100(msj2);
        divisible(num1,num2);
        
    }
    
    static int entre0y100(String c){
        
        int x;
        
        System.out.println(c);
        Scanner entrada = new Scanner(System.in);
        x = entrada.nextInt();
        
        while(x<0 || x>100){
            
            System.out.println("Error, ingrese numero entre 0 y 100");
            x = entrada.nextInt();
            
            
        }
        return x;
        
    }
    
    static void divisible(int x, int y){
        
        String s;
        
        if(x>y){
            
            s = x + " es divisible por " + y + ". ";
            
        }else {
            
            s = y + " es disivible por " + x + ". ";
            
        }
        
        System.out.println(s);
        
        
    }
    
}
