package ejercicio.pkg25;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        
        int i=1;
        boolean bandera;
        String contraseña;
        String clave = "eureka";
        
        System.out.println("Ingrese contraseña: ");
        Scanner entrada = new Scanner(System.in);    
        contraseña =  entrada.nextLine();
        bandera = clave.equals(contraseña);
        
        while(bandera == false && i <= 3){

            System.out.println("Inconrrecto le quedan " + (4 - i) + " intentos");
            contraseña = entrada.nextLine();
            bandera = clave.equals(contraseña);
            i++;
            
        }
        
         if(i==4 && bandera == false){

                System.out.println("Ha superado los 3 intentos!");

            }
          
       // System.out.println(clave.equals(contraseña));
        
    }
    
}
