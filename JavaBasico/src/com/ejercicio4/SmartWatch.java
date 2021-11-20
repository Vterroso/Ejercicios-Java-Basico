package com.ejercicio4;

public class SmartWatch extends SmartDevice{

    //Atributos

    String tipoCorrea;


    //Constructores

    public SmartWatch(){}

    public SmartWatch(String fabricante, String modelo, String sistemaOperativo, int bateria, String tipoCorrea) {
        super(fabricante, modelo, sistemaOperativo, bateria);
        this.tipoCorrea = tipoCorrea;
    }
}
