package ejercicio.pkg9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        int alumnos,sillas,disponible;
        String mensaje;
        
        System.out.println("Ingrese cantidad de alumnos: ");
        Scanner entrada = new Scanner(System.in);
        alumnos = entrada.nextInt();
        System.out.println("Ingrese cantidad de sillas: ");
        Scanner teclado = new Scanner(System.in);
        sillas = teclado.nextInt();
        
        disponible = sillas - alumnos;
        
        if(disponible>0){
            
            mensaje = "Si, alcanzan las sillas!! ";
            
        }else {
            
            mensaje = "Faltan " + disponible * -1 + " sillas";
            
        }
        
        System.out.println(mensaje);
        
    }
    
}
