package ejercicio.pkg12;
import java.util.Scanner;
public class Ejercicio12 {

    public static void main(String[] args) {
       
        char caracter;
        
        caracter = inicio();
        vocales(caracter);
        
    }
    
    static char inicio(){
        
        char x;
        
        System.out.println("Ingrese un caracter: ");
        Scanner entrada = new Scanner(System.in);
        x = entrada.next().charAt(0);
        
        return x;
    }
    
    static void vocales(char c){
        
        String m = "Es una letra vocal!";
        
        switch(c){
            
            case 'a':
                System.out.println(m);
                break;
            case 'e':
                System.out.println(m);
                break;
            case 'i':
                System.out.println(m);
                break;
            case 'o':
                System.out.println(m);
                break;
            case 'u':
                System.out.println(m);
                break;
            default:
                System.out.println("No es una letra vocal!");
                
                
                
        }
        
        
    }
    
}