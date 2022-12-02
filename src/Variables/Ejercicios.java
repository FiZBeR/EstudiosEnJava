package Variables;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        /*Instanciomos la clase scanner, creando un objeto (llamado scanner) al cual le indicamos el metodo
        * por el cual resivira informacion (System.in)*/

        Scanner scanner = new Scanner(System.in);
        //System.in es para resivir datos por consola, asi como System.out los muestra por pantalla

    //Ejercicio 1

        String numeroX = JOptionPane.showInputDialog(null, "Ingrese un numero");
        int x = Integer.parseInt(numeroX);

        String numeroY = JOptionPane.showInputDialog(null, "Ingrese otro numero");
        int y = Integer.parseInt(numeroY);

        int multiplicar = (x*y);
        int suma = x + y;
        int resta = (y-x);
        int division = x/y;

        String resultado = "Al sumar " + x + " + " + y + " nos da como resultado que la multiplicacion da " + multiplicar
                + " la suma da " + suma + " la resta da " + resta + " y la division da " + division;

        JOptionPane.showMessageDialog(null, resultado);

    //Ejercicio 2

        String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

    //Ejercicio 3

        System.out.println("¿Cual es tu nombre?");
        String nombre2 = scanner.nextLine();
        /*nextLine captura los datos que el usuario ingresa despues del out que nosotros enviamos, estos datos
        * son del tipo String*/

        System.out.println("¿Cual es tu direccion?");
        String direccion = scanner.nextLine();

        System.out.println("¿Cual es tu telefono?");
        String telefono = scanner.nextLine();

        System.out.println("Tus datos son \nNombre: " + nombre2 + " \nDireccion: " + direccion + " \nTelefono: " + telefono);
        // al utilizar \n le damos un salto de linia al mensaje

    //Ejercicio 4

        String pesos = JOptionPane.showInputDialog(null, "Cunatos pesos quiere pasar a euros?");
        int pesos2 = Integer.parseInt(pesos);

        int euro = 5055;
        int total = (euro * pesos2);



        JOptionPane.showMessageDialog(null, "Su dinero convertido a euros da " + total);

    //Ejercicio 5

        JOptionPane.showMessageDialog(null, "Bienvenido a supermercados Exito");

        String compra = JOptionPane.showInputDialog(null,"El valor de su compra es ");
        double c = Double.parseDouble(compra);

        double iva = c * 0.19;

        JOptionPane.showMessageDialog(null, "El valor de su compra antes de IVA es: " + compra);
        JOptionPane.showMessageDialog(null, "El valor de su compra despues del IVA es " + (c+iva));

    //Ejercicio 6

        char letra ='H';
        char letra2 ='o';
        char letra3 ='l';
        char letra4 ='a';

        String abc = " Mundo";

        System.out.print(letra);
        System.out.print(letra2);
        System.out.print(letra3);
        System.out.print(letra4);
        System.out.print(abc);


    }

}
