package com.ejercicios7_8_9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reverseTexto {

    public static void main(String[] args) {

        System.out.println("Introduzca un texto: ");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        System.out.println( "La cadena al reves es: "+ reverse(texto));




    }

    private static String reverse(String texto) {
        StringBuilder reverseText = new StringBuilder();
        for (int i=0; i<texto.length(); i++  ){
            reverseText.insert(0, texto.charAt(i));
        }
        return reverseText.toString();
    }


}
