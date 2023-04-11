package com.mycompany.egg_parte_1_inicio;
import java.util.Scanner;

public class EJERCICIO_1_3_EXTRA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UNA FRASE: ");
        String frase = leer.nextLine();
        
        System.out.println("LA FRASE EN MAYUSCULA ES :" + frase.toUpperCase());
        
        System.out.println("LA FRASE EN MINUSCULA ES :" + frase.toLowerCase());
    }
}
