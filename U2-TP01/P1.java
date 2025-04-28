/*
Cálculo del precio final de un artículo

Comprender:

    objetivo

        calcular el precio final del producto

    datos

        entrada precio base de un producto REAL

        entrada porcentaje de descuento REAL

        entrada porcentaje de IVA REAL

Diseñar:

    variables

        pBase = REAL

        pDesc = REAL

        pImp = REAL

    algoritmo

        clase a

        ingresar (pBase)

        ingresar (pDesc)

        ingresar (pImp)

        pFinal = pBase * pDesc * pImp

        mostrar (pFinal)

Desarrollar:
*/

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Precio base:");

            double pBase = sc.nextDouble();

            System.out.println("Descuento:");

            double pDesc = sc.nextDouble();

            pDesc = 1-pDesc/100;

            System.out.println("Impuestos:");

            double pImp = sc.nextDouble();

            pImp = 1+pImp/100;

            double pFinal = pBase * pDesc * pImp;

            System.out.println("Precio final: $"+ pFinal);
        }

    }

}