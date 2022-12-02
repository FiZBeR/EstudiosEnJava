package Variables;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1
        System.out.println("Bienvenido al calculador de areas, calculemos el area de un rectangulo");
        System.out.println("Ingresa la altura del rectangulo");
        double altura = scanner.nextDouble();
        System.out.println("Ingresa la base del rectangulo");
        double base = scanner.nextDouble();

        double area = altura * base;

        System.out.println("El area del rectangulo es: "+area);

        //Ejercicio 2
        System.out.println("Bienvenido al calculador de areas, calculemos el area de un triangulo");
        System.out.println("Ingresa la altura del triangulo");
        double h = scanner.nextDouble();
        System.out.println("Ingresa la base del triangulo");
        double b = scanner.nextDouble();

        double area2 = h * b / 2;

        System.out.println("El area del triangulo es: "+area2);

        //Ejercicio 3
        JOptionPane.showMessageDialog(null, "Calculemos tu salario");
        JOptionPane.showMessageDialog(null,"Tu salario por hora va ser pagado a 12 Euros");
        JOptionPane.showMessageDialog(null,"¿Cuantas horas trabajaste esta semana?");
        String horas = JOptionPane.showInputDialog(null, "Horas trabajadas: ");
        double ho = Double.parseDouble(horas);

        double valorH = 12;
        double salario = ho * valorH;

        JOptionPane.showMessageDialog(null, "Tu salario esta semana es: "+ salario);

        //Ejercicio 4
        JOptionPane.showMessageDialog(null, "Calculador de Mb a Kb");
        String mb = JOptionPane.showInputDialog(null,"Mb: ");
        double megab = Double.parseDouble(mb);

        double kb = megab*(1000/1.0);

        JOptionPane.showMessageDialog(null, "La convercion de Mb a Kb dan: "+kb);

        //Ejercicio 5

        //....................................................

    }
}
