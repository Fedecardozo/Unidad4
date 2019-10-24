package ejercicio.pkg15;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        
        char operador;
        int num,num2;
        
        num = numero();
        operador = inicio();
        num2 = numero();
        
        operaciones(num,operador,num2);
        
        
        
    }
    static int numero(){
        
        int s;
        
        System.out.println("Ingrese numero: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextInt();
        
        return s;
        
    }
     static char inicio(){
        
        char x;
        
        System.out.println("Ingrese '+', '-', '*', '/': ");
        Scanner entrada = new Scanner(System.in);
        x = entrada.next().charAt(0);
        
        return x;
        
        
    }
    
     static void operaciones(int x, char c, int y){
         
         int r;
         double m;
         
         switch(c){
             
            case '+':
                r = x + y;
                System.out.println("La suma es: " + r);
                break;
            case '-':
                r = x - y;
                System.out.println("La resta es: " + r);
                break;
            case '*':
                r = x * y;
                System.out.println("La multiplicacion es: " + r);
                break;
            case '/':
                
                if(y==0){
                    
                    System.out.println("No se puede dividir por 0");
                    
                }else {
                    
                    m = x / y;
                    System.out.println("La division es: " + m);
                    
                }
                break;
            default:
                System.out.println("Operador inconrrecto!");
                break;
                
         }
         
         
     }
     
}
