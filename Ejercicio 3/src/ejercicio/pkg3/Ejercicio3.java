package ejercicio.pkg3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        
        int num1,num2;
        double cociente;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numero: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        cociente = num1/num2;
        
        System.out.println("El cociente es: " + cociente);
        
    }
    
}
