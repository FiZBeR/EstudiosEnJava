package Arreglos;

import java.util.Arrays;

public class OrdenConsort {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "Juguete para perro";
        productos[1] = "Comida para perro mediano";
        productos[2] = "Casita para perros";
        productos[3] = "Vestido mujer maravilla para perro";
        productos[4] = "Cuernitos de Diablo";

        //El metodo sort nos ordena todos los elementos de nuestro arreglo en orden alfabetico
        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);


    }
}
