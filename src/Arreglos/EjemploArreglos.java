package Arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        //Declaracion del arreglo
                        //Instanciacion del arreglo
        int[] numeros = new int[10];

        numeros[0] = 100;
        numeros[1] = 10;
        numeros[2] = 20;
        numeros[3] = 30;
        numeros[4] = 40;
        numeros[5] = 50;
        numeros[6] = 60;
        numeros[7] = 70;
        numeros[8] = 80;
        numeros[9] = 90;


        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int m = numeros[3];
        int n = numeros[4];
        int o = numeros[5];
        int p = numeros[6];
        int q = numeros[7];
        int r = numeros[8];
        int s = numeros[numeros.length -1];

        System.out.println(i+" "+" "+ j+" "+" "+k+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s);

    }
}
