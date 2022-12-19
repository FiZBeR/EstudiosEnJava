package Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[5];


        int total = productos.length;

        productos[0] = "Juguete para perro";
        productos[1] = "Comida para perro mediano";
        productos[2] = "Casita para perros";
        productos[3] = "Vestido mujer maravilla para perro";
        productos[4] = "Cuernitos de Diablo";

        Arrays.sort(productos);
        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("==============For Each===============");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("==============While===============");
        int i = 0;
        while (i < total){
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("==============While===============");
        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        }while (j < total);

    /*================================Iterando de atras hacia delante============================================*/


    }
}
