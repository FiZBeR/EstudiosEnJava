package Ejercicios;

import java.util.Scanner;

public class Condicionales1a10 {
    public static void main(String[] args) {

        //Ejercicio 1 Escribe un programa que pida por teclado un día de la semana y que diga qué
        //asignatura toca a primera hora ese día.

        Scanner scam = new Scanner(System.in);

        String Lunes = "Lunes: Ciencias Naturales a las 9:00AM", Martes = "Martes: Sociales a las 8:00AM", Miercoles = "Miercoles: Educacion Fisica a las 11:00AM",
                Jueves = "Jueves: Matematicas a las 10:00AM", Viernes = "Viernes: Fisica a las 7:00AM", Sabado = "Sabado: Ingles a las 10:00AM";

        System.out.println("Que dia de la semana quieres averiguar tu horario?");
        String dia = scam.nextLine();

        switch (dia){
            case "Lunes":
                System.out.println(Lunes);
                break;
            case "Martes":
                System.out.println(Martes);
                break;
            case "Miercoles":
                System.out.println(Miercoles);
                break;
            case "Jueves":
                System.out.println(Jueves);
                break;
            case "Viernes":
                System.out.println(Viernes);
                break;
            case "Sabado":
                System.out.println(Sabado);
                break;
            default:
                System.out.println("el dia inscrito no es valido");
        }

        /*Ejercicio 2
        * Realiza un programa que pida una hora por teclado y que muestre luego buenos
        días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
        6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
        horas, los minutos no se deben introducir por teclado.*/

        System.out.println("Ingrese una hora en formato 24H");
        int hora = scam.nextInt();

        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos Dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas Tarde");
        } else if (hora >= 21 && hora <= 24) {
            System.out.println("Buenas Noches");
        }else if(hora < 5){
            System.out.println("Buenas Noches");
        }else
            System.out.println("Hora no valida");


        /*Ejercicio 3
        *  */
    }
}
