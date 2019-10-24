package ejercicio.pkg19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        
        int num;
        num = numero();
        forAste(num);
    }
    
    static int numero(){
        
        int s;
        
        System.out.println("Ingrese numero: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextInt();
        
        return s;
        
    }
    static void forAste(int x){
        
        
        for(int i=1; i<=x; i++){
            for(int j=x;j>=i;j--){
                
               System.out.print('*'); 
               
            } 
            System.out.println(" ");
        }
        
    }
    
}
