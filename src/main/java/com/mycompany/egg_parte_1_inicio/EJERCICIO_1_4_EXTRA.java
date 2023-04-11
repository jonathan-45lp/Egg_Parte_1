package com.mycompany.egg_parte_1_inicio;
import java.util.Scanner;

public class EJERCICIO_1_4_EXTRA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE EL VALOR DEL GRADO");
        int grado = leer.nextInt();
        
        float fahrenheit = 32 + (9 * grado / 5);
        
        System.out.println("EL GRADO PASA A FAHRENHEIT ES DE: " + fahrenheit);
    }
}
