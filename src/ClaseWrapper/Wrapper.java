package ClaseWrapper;

public class Wrapper {
    public static void main(String[] args) {

        /*Estas clases representar un primitivo pero en forma de objeto dandole mayor funcionalidadad
        * cada primitivo tiene su base equivalente donde esta se diferencia en su mayoria comienza con mayuscula
        * excepto el tipo entero donde se define como Integer y char donde su clase equivalente es Character*/

        //Conversion de primitivo en wrapper ejemplo con enteros
        int intPtimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPtimitivo);

        /*Autoboxing*/ Integer intObjeto2 = 32768;

        //Conversion de wrapper a primitivo ejemplo con enteros
        int num = intObjeto;
        int num2 = intObjeto.intValue();





    }
}
