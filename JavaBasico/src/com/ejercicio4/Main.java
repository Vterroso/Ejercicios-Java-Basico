package com.ejercicio4;

public class Main {

    public static void main(String[] args) {
        /*
        En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

        Agregaréis atributos tal cual tendrían esos objetos en la realidad.

        Crear constructor vacío y con todos los parámetros para cada clase.

        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
         */



        System.out.println("CATÁLAGO DE PRODUCTOS DISPONIBLES " + "\n");

        SmartWatch galaxyWatch4 = new SmartWatch("Samsung", "Galaxy Whatch 4", "Android", 2200, "cuero");

        System.out.println(galaxyWatch4.fabricante + " " + galaxyWatch4.modelo);
        System.out.println("Sistema operativo: " + galaxyWatch4.sistemaOperativo);
        System.out.println("Batería: " + galaxyWatch4.bateria + " mAh");
        System.out.println("Tipo de correa: " + galaxyWatch4.tipoCorrea);

        System.out.println("");

        SmartPhone iphone11 = new SmartPhone("Apple", "iPhone 11","macOS", 5500, true);

        System.out.println(iphone11.fabricante + " " + iphone11.modelo);
        System.out.println("Sistema operativo: " + iphone11.sistemaOperativo);
        System.out.println("Batería: " + iphone11.bateria + " mAh");
        if (iphone11.cobertura5G = true) {
            System.out.println("Cobertura 5G");
        }
    }
}
