package Operadores;

import javax.swing.*;
import java.util.Scanner;

public class EjerciciosOperarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Numeros pares o impares

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("Numero Par = "+numero);
        } else {
            System.out.println("Numero Impar = "+ numero );
        }

        //Login Basico

        String usuario = "Cristian";
        String clave = "12345";

        String usuario2 = "Santiago";
        String clave2 = "12345";

        JOptionPane.showMessageDialog(null,"Ingrese el Usuario");
        String u = JOptionPane.showInputDialog(" ");

        JOptionPane.showMessageDialog(null, "Ingrese la contraseña");
        String p = JOptionPane.showInputDialog(" ");

        boolean autentificacion = false;

        if(usuario.equals(u) && clave.equals(p) || usuario2.equals(u) && clave2.equals(p)){
            autentificacion = true;
        } else {
            JOptionPane.showMessageDialog(null,"Usuario o contraseña son incorrectas");
        }

        if(autentificacion){
            JOptionPane.showMessageDialog(null,"Bienvenido ".concat(u));
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales Invalidas");
        }
    }
}
