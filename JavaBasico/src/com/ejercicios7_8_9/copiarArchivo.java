package com.ejercicios7_8_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class copiarArchivo {

    public static void main(String[] args) {

        String origen = "C:/Users/victi/Hola.txt";
        String destino = "C:/Users/victi/Copia.txt";

        if (!copia (origen, destino)){
            System.out.println("Error al copiar el fichero");
        }


    }
        public static boolean copia (String origen, String destino){

            try{
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);

                var contenido = in.readAllBytes();
                out.write(contenido);

                in.close();
                out.close();

                return true;

            } catch (Exception e){
                System.out.println("Ha ocurrido una excepción: " + e.getMessage());

            }

            return true;

        }



}
