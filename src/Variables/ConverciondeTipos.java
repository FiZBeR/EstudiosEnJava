package Variables;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class ConverciondeTipos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*Una forma de realizar conversiones consiste en colocar el tipo destino entre paréntesis,
        *a la izquierda del valor que queremos convertir de la forma siguiente:
        *Tipo VariableNueva = (NuevoTipo) VariableAntigua*/

        int numero = 78;
        //Convercion
        float numero2 = numero ;
        System.out.println("numero2 = " + numero2);

        String numero4 = "34";
        /*short aa = (short)numero4;
        System.out.println("aa = " + aa);*/
        /*En teoria podemos forzar la convercion del dato colocando el tipo entre comillas*/


        //Integer.parseInt = Tipo.parse(Tipo)
        String numeroPrueba = "5883";
        double realNumero = Double.parseDouble(numeroPrueba);

        //El metodo Tipo.parse(Tipo) solo aplica de String a otro tipo no de cualquier tipo a otro
        float numero3 = Float.parseFloat(numero4);//<- Solo String

        System.out.println("numero3 = " + numero3);
        System.out.println("realNumero = " + realNumero);

        String numeroo = "50";
        int numerooo = Integer.parseInt(numeroo);
        System.out.println("numerooo = " + numerooo);

        String realstr = "83779.093";
        double numero5 = Double.parseDouble(realstr);
        System.out.println("numero5 = " + numero5);

        String logicostr = "true";
        boolean a = Boolean.parseBoolean(logicostr);
        System.out.println("a = " + a);

        // Primitivo -> String

        int numeroint = 120;

        String numerostr1 = Integer.toString(numeroint);
        // toString no ayuda como se llama a convertirlo a string
        // Antes del toString colocamos el tipo de variable que es a la cual llevaremos a ser string

    //Ejercicio Factura

        /*System.out.println("La factura ");
        String nombreFactura = scanner.nextLine();
        System.out.println("Con un valor de ");
        double valor = scanner.nextDouble();

        double iva =25.6082;
        double total = iva + valor;

        System.out.println("El valor de la factura mas iva es de "+ total);*/

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de producto:");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);
    }
}
