package ejercicio.pkg14;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        
        char letra;
        
        letra = inicio();
        numRomanos(letra);
        
    }
    
    static char inicio(){
        
        char x;
        
        System.out.println("Ingrese una letra romana: ");
        Scanner entrada = new Scanner(System.in);
        x = entrada.next().charAt(0);
        
        return x;
        
        
    }
    
    static void numRomanos(char x){
        
        switch(x){
            
//            case 'i':
//                System.out.println("1");
//                break;
//            case 'v':
//                System.out.println("5");
//                break;
//            case 'x':
//                System.out.println("10");
//                break;
//            case 'l':
//                System.out.println("50");
//                break;
//            case 'c':
//                System.out.println("100");
//                break;
//            case 'd':
//                System.out.println("500");
//                break;
//            case 'm':
//                System.out.println("1000");
//                break;
            case 'I':
                System.out.println("1");
                break;
            case 'V':
                System.out.println("5");
                break;
            case 'X':
                System.out.println("10");
                break;
            case 'L':
                System.out.println("50");
                break;
            case 'C':
                System.out.println("100");
                break;
            case 'D':
                System.out.println("500");
                break;
            case 'M':
                System.out.println("1000");
                break;    
            default:
                System.out.println("No existe tal digito!");
                break;
            
        }
        
        
    }
}
