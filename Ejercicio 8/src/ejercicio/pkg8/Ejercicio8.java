package ejercicio.pkg8;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        
      
        int num = inicioEdad();
        char gene = inicioGenero();
        jubilar(num,gene);
        
    }
    
    static int inicioEdad(){
        
        int edad;
       
        System.out.println("Ingrese edad entre 1 y 120: ");
        Scanner entrada = new Scanner(System.in);
        edad = entrada.nextInt();
        
        while (edad<1 || edad>120){
            
            System.out.println("Error, ingrese edad entre 1 y 120");
            //Scanner entrada = new Scanner(System.in);
            edad = entrada.nextInt();
            
        }
        
        return edad;
    }
    
    static char inicioGenero(){
        
        char sexo;
        
        System.out.println("Ingrese su genero: ");
        Scanner teclado = new Scanner(System.in);
        sexo = teclado.next().charAt(0);
        
        while (sexo != 'm' && sexo != 'f'){
            
            System.out.println("Error!, ingrese genero valido: ");
            sexo = teclado.next().charAt(0);
            
        }
        
        return sexo;
        
    } 
    
    static void jubilar(int x,char s){
        
        String mensaje;
        
         if (x>59 && s=='f'){
            
            mensaje = "Se puede jubilar";
            
        }
        else if (x>64 && s=='m'){
            
            mensaje = "Se puede jubilar";
            
        }else{
            
            mensaje = "No se puede jubilar";
            
        }
        
        System.out.println(mensaje);
        
    }
    
}
