package Operadores;

import javax.swing.*;
import java.util.Scanner;

public class EjerciciosOperarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Numeros pares o impares

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println(numero + " es Par ");
        } else {
            System.out.println(numero + " es Impar ");
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

        //EJERCICIO 3

        int max = 0;

        System.out.println("Ingrese un numero");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese un segundo numero");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese un tercer numero");
        int numero3 = scanner.nextInt();

        max = (numero1 > numero2)? numero1: numero2;
        max = (max > numero3)? max: numero3;

        System.out.println("El numero mayor es "+ max);

        //EJERCICIO 4

        int maxx = 0;

        System.out.println("Digite un numero");
        int num = scanner.nextInt();

        System.out.println("Digite otro numero");
        int num2 = scanner.nextInt();

        System.out.println("los numeros ordenados son: "+ max + num2);

        if(num > num2){
            System.out.println("Los numeros ordenados son "+ num + num2);
        } else {
            System.out.println("Los numeros ordenados son "+ num2 + num);
        }

        //EJERCICIO 5


        int tanque = 70;
        System.out.println("Ingrese el medida actual del tanque");
        int actual = scanner.nextInt();

        if(actual == tanque){
            System.out.println("Tanque lleno");
        } else if (actual >= 60 && actual <= 70 ) {
            System.out.println("Tanque casi lleno");
        } else if (actual > 40 && actual < 60) {
            System.out.println("Tanque 3/4");
        } else if (actual > 35 && actual < 40 ) {
            System.out.println("Tanque medio lleno");
        } else if (actual >= 20 && actual <= 35) {
            System.out.println("Tanque suficiente");
        } else {
            System.out.println("Tanque insuficiente");
        }


        //EJERCICIO 6

        String nom1, nom2, nom3;
        int nomA, nomB, nomC;

        nom1 = JOptionPane.showInputDialog(null,"Primer nombre");
        nom2 = JOptionPane.showInputDialog(null,"Segundo nombre");
        nom3 = JOptionPane.showInputDialog(null,"Tercer nombre");

        nomA = nom1.length();
        nomB = nom2.length();
        nomC = nom3.length();

        if(nomA > nomB && nomA > nomC){
            JOptionPane.showMessageDialog(null,"El nombre mas largo es "+ nom1 + " con un total de " + nomA + " letras");
        } else if (nomB > nomA && nomB > nomC) {
            JOptionPane.showMessageDialog(null,"El nombre mas largo es "+ nom2 + " con un total de " + nomB + " letras");
        } else {
            JOptionPane.showMessageDialog(null,"El nombre mas largo es "+ nom3 + " con un total de " + nomC + " letras");
        }

    }
}
