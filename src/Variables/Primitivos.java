package Variables;

public class Primitivos  {
    public static void main(String[] args){

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo de byte correspondiente en byte a " + Byte.BYTES);
        System.out.println("tipo de bites correspondiente en byte a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo de short correspondiente en byte a " + Short.BYTES);
        System.out.println("tipo de short correspondiente en byte a " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        int numeroEntero = 2147483647;
        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("tipo de entero correspondiente en byte a " + Integer.BYTES);
        System.out.println("tipo de entero correspondiente en byte a " + Integer.SIZE);
        System.out.println("Valor maximo de un entero: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un entero: " + Integer.MIN_VALUE);

        long numeroLong = 21474836478l;
        //Al usar un nmero de tipo long siempre toca estableserla colocando una letra l al final del numero
        //esto dando a entender que es de tipo Long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo de long correspondiente en byte a " + Long.BYTES);
        System.out.println("tipo de long correspondiente en byte a " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
    }
}
