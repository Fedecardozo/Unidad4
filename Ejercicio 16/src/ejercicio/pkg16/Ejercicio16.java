package ejercicio.pkg16;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        
        int num,opcion;
        
        opcion = opciones();
        num = numero();
        segun(opcion,num);
       
    }
    static int opciones(){
        
        System.out.println("Ingrese 1 para opcion For: ");
        System.out.println("Ingrese 2 para opcion While: ");
        System.out.println("Ingrese 3 para opcion Do While: ");
        Scanner ingreso = new Scanner(System.in);
        int x = ingreso.nextInt();
        
        return x;
        
    }
    static int numero(){
        
        int s;
        
        System.out.println("Ingrese numero: ");
        Scanner teclado = new Scanner(System.in);
        s = teclado.nextInt();
        
        return s;
        
    }
    static void segun(int s, int n){
        
        switch(s){
        
            case 1: 
                System.out.println("Funcion For!");
                siguientesFor(n);
                break;
            case 2:
                System.out.println("Funcion While!");
                siguientesWhile(n);
                break;
            case 3:
                System.out.println("Funcion Do While!");
                siguientesDoWhile(n);
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta!");
                break;
    }
        
    }
    static void siguientesFor(int x){
        
        int r,m;
        
        m=x;
        r=x+10;
        
        for (int i=x; i<r ; i++){
            
            m++;
            System.out.println(m);
            
            
        }  
       
        
    }
    
    static void siguientesWhile(int x){
        
        int r;
        
        r = x + 9;
        
        while(x<=r){
            
            x++;
            
            System.out.println(x);
            
        }
        
    }
    
    static void siguientesDoWhile(int x){
        
        int r;
        int i=x;
        r = x + 9;
        do{
            i++;
            System.out.println(i);

        }while(r >= i);
            
        
    }
}
