package Arreglos;

import java.util.Arrays;

public class OrdenamientoBurbuja {

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

        String[] productos = {"Juguete para perro", "Comida para perro mediano", "Casita para perros"
        , "Vestido mujer maravilla para perro", "Cuernitos de Diablo"};

        int total = productos.length;
        //Primer for recorre cada elemento
        for (int i = 0; i < total; i++){
            //El segundo for compara cada elemento
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            }
        }

        //Arrays.sort(productos);
        //arrelgloinverso(productos);

        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }
}
