package com.ejercicios7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayListString {

    public static void main(String[] args) {

        ArrayList <String> lista1 = new ArrayList<>();
        lista1.add ("Uno");
        lista1.add ("Dos");
        lista1.add ("Tres");
        lista1.add ("Cuatro\n");

        for (int i =0; i<lista1.size(); i++){
            System.out.println(lista1.get(i));
        }

        LinkedList<String> listaEnlazada = new LinkedList<>(lista1);

        for(String elemento : listaEnlazada){
            System.out.println(elemento);
        }



    }
}
