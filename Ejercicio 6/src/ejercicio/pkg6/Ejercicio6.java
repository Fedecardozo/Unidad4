package ejercicio.pkg6;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        
        int base,altura,cuadrado;
        double superficie,hipotenusa,perimetro;
        
        System.out.println("Ingrese base del triangulo rectangulo: ");
        Scanner entrada = new Scanner(System.in);
        base = entrada.nextInt();
        System.out.println("Ingrese altura del triangulo: ");
        altura = entrada.nextInt();
        
        superficie = base * altura/2;
        cuadrado = (base * base) + (altura * altura);
        
        hipotenusa = Math.sqrt(cuadrado);
        
        perimetro = altura + base + hipotenusa;
        
        System.out.println("La superficie es: " + superficie);
        System.out.println("El perimetro es: " + perimetro);
        
    }
    
}
