package com.ejercicio4;

public class SmartDevice {

    //Atributos
    String fabricante;
    String modelo;
    String sistemaOperativo;
    int bateria;


    //Contructor

    public SmartDevice(){}

    public SmartDevice(String fabricante, String modelo, String sistemaOperativo, int bateria) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.bateria = bateria;
    }
}
