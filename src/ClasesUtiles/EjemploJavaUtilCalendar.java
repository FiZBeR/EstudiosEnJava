package ClasesUtiles;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        //Personalizar la fecha que aparece

        Calendar calendario = Calendar.getInstance();
        /*Esta clase a diferencia de las otras no se puede instanciar con el operador new, ya que por diseño
        * esta viene asi, para poder instanciarla lo tenemos que hacer colocando el nombre de la clase junto
        * al metodo getInstance*/

        //calendario.set(2020, 9, 7);

        calendario.set(Calendar.YEAR, 2019);
        calendario.set(Calendar.MONTH, 2);
        calendario.set(Calendar.DAY_OF_MONTH, 13);

        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 32);
        calendario.set(Calendar.SECOND, 55);
        calendario.set(Calendar.MILLISECOND, 315);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss:SSS a");
        //Para agregar la hora en nuestro formato utilizamos 2 h en mayuscula para formato 24H en minuscula sera 12H
        //Para los minutos seguidos de 2 puntos dos m en minuscula
        //De igual forma con segundos pero con 2 ss
        //Para milisegundos usamos 3 s en mayusculas
        //Y para agregar el formato de am o pm basta con colocar una a al final
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);
    }
}
