package ejercicio.pkg22;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        
        int num;
        num = numero();
        mientras(num);
        
        
    }
    static int numero(){
        
        int s;
        
        System.out.println("Ingrese numero: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextInt();
        
        return s;
        
    }
    static void mientras(int x){
        
        int i = 1; int j = 1;
        
        while(i <= x){
        
            i++;
            
            while(j >= x){
                
                j++;
                System.out.print("*");
                
            }
            
        
        }
        
        System.out.println(" ");
        
    }
    
}
