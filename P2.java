/*
    2. Conversión de temperatura de Celsius a Fahrenheit
    Desarrollar un algoritmo que tome como entrada una temperatura en grados Celsius y la convierta a grados Fahrenheit utilizando la fórmula:
    Fahrenheit = (Celsius × 9/5) + 32

    Comprender{
        pasar de unidad de celcius a fahrenheit
        Celcius = entrada REAL
        Fahrenheit = salida REAL
    }

    Diseñar{
        Leer Celcius = REAL
        Fahrenheit = (Celsius × 9/5) + 32 = REAL
        Mostrar = Fahrenheit
    }
*/

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Temperatura en Celsius = ");

            Double celsius = sc.nextDouble();

            Double fahrenheit = (celsius * 9/5) + 32;

            System.out.println(celsius + "°C = " + fahrenheit +"°F");
        }

    }
}
