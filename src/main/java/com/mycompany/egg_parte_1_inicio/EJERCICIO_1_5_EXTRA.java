package com.mycompany.egg_parte_1_inicio;
import java.util.Scanner;

public class EJERCICIO_1_5_EXTRA {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO ENTERO: ");
        int num = leer.nextInt();
        
        System.out.println("EL DOBLE ES: " + num*2);
        
        System.out.println("EL TRIPLE ES: " + num*3);
        
        System.out.println("LA RAIZ CUADRADA ES: " + Math.sqrt(num));
        
    }
}
