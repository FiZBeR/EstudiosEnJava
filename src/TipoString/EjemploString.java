package TipoString;

public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String curso2 = new String("Diciembre");

        //Concadenacion

        String date = curso + "comienza en " + curso2;
        System.out.println("date = " + date);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(date + numeroA + numeroB);
        //Aca los numeros no se suman como tipos numericos ya que el programa entiende al comenzar
        //que se trata de una cadena de caracteres

        System.out.println(date + (numeroA+numeroB));
        //En este caso se imprime el resultado ya que el programa da prioridad a los parentecis
        //haciendo entender que comienza con un tipo numerico y que estos se sumaran por lo mismo

        String detallle = curso.concat(curso2);
        /*El metodo concat,concadena dos string o incluso seguir concadenando dentro del la primera invoacion*/

    }
}
