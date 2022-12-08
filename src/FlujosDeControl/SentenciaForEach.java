package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {
        /*Solo uzamos el for each cuando necesitamos iterar sobre arreglos o colecciones*/

        //Arreglo
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        //Estructura
        /*Utilizamos un for, entre parentesis colocamos el tipo de datos de los elementos
        * después utilizamos el dos puntos y le pasamos el nombre del arreglo*/

        /*A diferencia del for la estructura interna de esta es la que cambia y define que sea un FOREACH*/
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Heidy", "Ambar", "Princesa", "Cristian", "Pato"};

        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
