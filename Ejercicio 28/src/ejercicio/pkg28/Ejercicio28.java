package ejercicio.pkg28;

import java.util.Scanner;

public class Ejercicio28 {

    
    public static void main(String[] args) {
        
        String contraseña,usuario,clave,user;
        boolean bandera,banderin;
        
        clave = " "; user = " ";
        contraseña = "1234";
        usuario = "admin";
        
        do {
            
            System.out.println("Ingrese usario: ");
            Scanner entrada = new Scanner(System.in);
            user = entrada.nextLine();
            
            System.out.println("Ingrese contraseña: ");
            Scanner teclado = new Scanner(System.in);
            contraseña = teclado.nextLine();
            
            banderin = usuario.equals(user);
            bandera = contraseña.equals(clave);
            
           /* if(banderin == true && bandera == true){
                
                System.out.println("Ingreso con exito!!");
                
            }else if(banderin == false || bandera == false){
                
                System.out.println("Contraseña o usuario incorrecto. Acontinuacion...");
                
            }*/
             
        } while (bandera == false && banderin == false);
        
        
        
    }
    
}
