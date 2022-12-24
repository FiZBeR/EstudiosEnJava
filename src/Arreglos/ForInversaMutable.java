package Arreglos;

import java.util.Arrays;

public class ForInversaMutable {

    public static void arrelgloinverso(String[] arreglo){
        //For inverso como metodo
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total/2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i]= actual;
            total2--;
        }
    }
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
        arrelgloinverso(productos);

        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }
}
