package com.ejercicios7_8_9;

import java.util.Vector;

public class vector {

    public static void main(String[] args) {

        Vector <Integer> vector = new Vector<Integer>();

        vector.add(5);
        vector.add(10);
        vector.add(20);
        vector.add(25);
        vector.add(30);

        vector.remove(2);
        vector.remove(2);

        for (int i = 0; i<vector.size(); i++){
            System.out.println("Posición: "+i+ " Valor = " + vector.get(i));
        }






    }
}
