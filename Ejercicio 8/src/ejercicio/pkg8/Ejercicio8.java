package ejercicio.pkg8;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        
        int edad;
        char sexo;
        String mensaje;
        
        System.out.println("Ingrese edad entre 1 y 120: ");
        Scanner entrada = new Scanner(System.in);
        edad = entrada.nextInt();
        
        while (edad<1 || edad>120){
            
            System.out.println("Error, ingrese edad entre 1 y 120");
            //Scanner entrada = new Scanner(System.in);
            edad = entrada.nextInt();
            
        }
        System.out.println("Ingrese su genero: ");
        Scanner teclado = new Scanner(System.in);
        sexo = teclado.next().charAt(0);
        
        while (sexo != 'm' && sexo != 'f'){
            
            System.out.println("Error!, ingrese genero valido: ");
            sexo = teclado.next().charAt(0);
            
        }
        
        if (edad>59 && sexo=='f'){
            
            mensaje = "Se puede jubilar";
            
        }
        else if (edad>64 && sexo=='m'){
            
            mensaje = "Se puede jubilar";
            
        }else{
            
            mensaje = "No se puede jubilar";
            
        }
        
        System.out.println(mensaje);
        
    }
    
}
