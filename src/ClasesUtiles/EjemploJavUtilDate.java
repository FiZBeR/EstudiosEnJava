package ClasesUtiles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        // Este comando SimpleDateFormat lo utilizamos para darle un nuevo formato a la clase date que trae por defecto
        // Con dd nos muestra el dia
        // Con 2 m en mayuscula nos muestra el mes en numero, con 3 m muestra un mes corto y con 4 el nombre del mes
        // Con yyyy nos muestra el año
        // Tambien entre espacios podemos agrgar slash o guiones como separacion
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
    }
}
