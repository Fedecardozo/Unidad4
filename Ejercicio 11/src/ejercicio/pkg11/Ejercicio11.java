package ejercicio.pkg11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        int lado1,lado2,lado3;
        boolean bandera;
        
        System.out.println("Ingrese lado 'A' del triangulo: ");
        Scanner entrada = new Scanner(System.in);
        lado1 = entrada.nextInt();
        System.out.println("Ingrese lado 'B' del triangulo: ");
        lado2 = entrada.nextInt();
        System.out.println("Ingrese lado 'C' del triangulo: ");
        lado3 = entrada.nextInt();
        
        bandera = lados(lado1,lado2,lado3);
        triangulos(bandera,lado1,lado2,lado3);
        
    }
    
    static boolean lados(int a, int b, int c){
        
        int s,r,z,m;
        boolean n;
        m = 0;
        
        s = a + b;
        r = a + c;
        z = b + c;
        
        if(s > c){
            
            m++; 
        }
        if(r>b){
            
            m++; 
        }
        if(z > c){
            
            m++;   
        }
        if(m==3){
            
            System.out.println("Triangulo valido");
            n = true;
            
        }else {
            
            System.out.println("Triangulo invalido");
            n = false;
        }
        
        return n;
    }
    
    static void triangulos(boolean x,int a, int b, int c){
        
        if(x==true){
            
            if(a==b && b==c){
                
                System.out.println("Es un triangulo equilatero!");
                
            }else if(a==b || b==c){
                
                System.out.println("Es un triangulo isoseles!");
            }else{
                
                System.out.println("Es un triangulo escaleno!");
                
            }
            
        }
        
    }
}
