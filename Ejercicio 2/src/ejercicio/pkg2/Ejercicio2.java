package ejercicio.pkg2;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        
        int num1,num2,cociente,resto;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numero: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        cociente = num1/num2;
        resto = num1%num2;
        
        System.out.println("El cociente es: " + cociente);
        System.out.println("El resto es: " + resto );
    }
    
}
