package FlujosDeControl;

import javax.swing.*;

public class Ejercicios {
    public static void main(String[] args) {

        //Año bisiesto

        String eleccion = JOptionPane.showInputDialog(null, "Ingrese el numero del mes a determinar");
        int mes = Integer.parseInt(eleccion);

        int numerodias = 0;

        String eleccion2 = JOptionPane.showInputDialog(null, "Ingrese el año (YYYY)");
        int anio = Integer.parseInt(eleccion2);
        ;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numerodias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numerodias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numerodias = 29;
            } else {
                numerodias = 28;
            }
        }
        System.out.println("numerodias = " + numerodias);

        //For y arreglos

        String[] nombres = {"Andres", "Pepe", "Maria", "Heidy", "Cristian", "Pato", "Pepa"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("pepa")) {
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        Boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + "Fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null,buscar + "No existe en el sistema");
        }
    }
}
