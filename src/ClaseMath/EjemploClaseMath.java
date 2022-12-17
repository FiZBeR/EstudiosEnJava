package ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        //Maximo entre 2
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        //Minimo entre 2
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        //Redondear valor maximo
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        //Redondear valor minimo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        //Exponencial E=2.7182818....
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        //Logaritmo
        double log = Math.log(10);
        System.out.println("log = " + log);

        //Potencia
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        //Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        /*-----------------------------------------TRIGONOMETRIA------------------------------------------------*/

        //Convertir un angulo de radiales a grados
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        //De grados a radiales
        double radiales = Math.toRadians(90.00);
        radiales = Math.round(radiales);
        System.out.println("radiales = " + radiales);

        //seno
        System.out.println("sin(90): " + Math.sin(radiales));
        //coseno
        System.out.println("cos(90): " + Math.cos(radiales));
    }
}
