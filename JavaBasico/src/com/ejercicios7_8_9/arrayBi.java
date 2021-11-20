package com.ejercicios7_8_9;

import java.util.Arrays;

public class arrayBi {

    public static void main(String[] args) {

        int arraybi [][] = {
                {10, 20, 30, 40},
                {5, 15, 25, 35}
        };

        for (int i=0; i<arraybi.length; i++) {
            for (int j=0; j<arraybi[i].length; j++){
                System.out.println("Posición ["+i+"]["+j+"] Valor: " + arraybi [i][j]);
            }

        }

    }
}
