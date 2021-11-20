package com.ejercicio4;

public class SmartPhone extends SmartDevice{

    //Atributos específicos

    boolean cobertura5G;

    //Contructores

    public SmartPhone(){}


    public SmartPhone(String fabricante, String modelo, String sistemaOperativo, int bateria, boolean cobertura5G) {
        super(fabricante, modelo, sistemaOperativo, bateria);
        this.cobertura5G = cobertura5G;
    }
}


