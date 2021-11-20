package com.ejercicios7_8_9;

import java.util.ArrayList;

public class arrayListInt {

    public static void main(String[] args) {

        ArrayList <Integer> lista2 = new ArrayList<>();
        for(int i=1; i<=10; i++){
            lista2.add(i);
        }
        for (int i=0; i<lista2.size(); i++){
            if (lista2.get(i) %2 ==0){
                lista2.remove(i);
            }
        }
        for (int elemento : lista2) {
            System.out.println(elemento);
        }
    }
}
