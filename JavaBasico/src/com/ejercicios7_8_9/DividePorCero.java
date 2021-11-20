package com.ejercicios7_8_9;

import java.util.Scanner;

public abstract class DividePorCero {

    public static void main(String[] args) {
        /*Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
        mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".*/

        System.out.println("Introduce dos números: ");
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        try {
            DividePorCero(numero1,numero2);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


    }



    public static int DividePorCero(int numero1, int numero2) throws ArithmeticException {
        int resultado = 0;
        try{
            resultado = numero1 / numero2;
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }

        return numero1/numero2;
    }
}