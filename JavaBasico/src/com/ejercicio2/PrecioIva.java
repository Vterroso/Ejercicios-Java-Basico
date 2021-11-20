package com.ejercicio2;

import java.util.Scanner;

public class PrecioIva {
    public static void main(String[] args) {

        /*
        Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
         */

        double precioSiniva = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Introduzca el precio sin IVA");
        precioSiniva = entrada.nextDouble();


        double resultado = (precioSiniva + (precioSiniva * 0.21));



        System.out.println(" El precio total ( +21% IVA ) es " + resultado);



    }
}
