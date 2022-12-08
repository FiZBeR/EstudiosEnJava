package ClasesUtiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fecha = format.parse("30-08-2022");
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
        } catch (ParseException e){
            e.printStackTrace();
        }


    }
}
