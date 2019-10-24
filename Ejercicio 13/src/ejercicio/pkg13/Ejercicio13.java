package ejercicio.pkg13;
import java.util.Scanner;
public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        int mes;
        
        mes = inicio();
        meses(mes);
        
    }
    
    static int inicio(){
        
        int x;
        
        System.out.println("Ingrese numero del mes: ");
        Scanner entrada = new Scanner(System.in);
        x = entrada.nextInt();
        
        return x;
    }
    
    static void meses(int x){
        
        switch(x){
            
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;    
            default:
                System.out.println("Mes incorrecto");
                break;
            
        }
        
        
    }
}
