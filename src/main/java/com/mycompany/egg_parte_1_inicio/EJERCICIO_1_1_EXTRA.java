package com.mycompany.egg_parte_1_inicio;

import java.util.Scanner;

public class EJERCICIO_1_1_EXTRA{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        int num1 = leer.nextInt();
        
        System.out.println("INGRESE EL SEGUNDO   NUMERO: ");
        int num2 = leer.nextInt();
    
        System.out.println("LA SUMA ES: " + (num1 + num2));
    }
}
