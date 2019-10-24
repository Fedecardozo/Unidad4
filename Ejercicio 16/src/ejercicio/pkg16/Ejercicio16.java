package ejercicio.pkg16;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        
        int num;
        
        num = numero();
       // siguientesFor(num);
        //siguientesWhile(num);
        siguientesDoWhile(num);
    }
    
    static int numero(){
        
        int s;
        
        System.out.println("Ingrese numero: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextInt();
        
        return s;
        
    }
    static void siguientesFor(int x){
        
        int r,m;
        
        m=x;
        r=x+10;
        
        for (int i=x; i<r ; i++){
            
            m++;
            System.out.println(m);
            
            
        }  
        
    }
    
    static void siguientesWhile(int x){
        
        int r;
        
        r = x + 9;
        
        while(x<=r){
            
            x++;
            
            System.out.println(x);
            
        }
        
    }
    
    static void siguientesDoWhile(int x){
        
        int r;
        int i=x;
        r = x + 9;
        do{
            i++;
            System.out.println(i);

        }while(r == i);
            
        
    }
}
