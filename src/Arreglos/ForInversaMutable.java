package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInversa {
    public static void main(String[] args) {

    /*================================Iterando de atras hacia delante============================================*/

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
        //For inverso
        for (int i = 0; i < total; i++){
            System.out.println("para i = " + (total-1-i) + "valor: " + productos[total-1-i]);
        }




    }
}
