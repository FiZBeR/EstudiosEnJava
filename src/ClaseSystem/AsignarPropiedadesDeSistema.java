package ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try{

        //La clase FileInputStream no ayuda a que el programa cargue y lea nuestro archivo
        // donde al final colocamos la ruta de este

        FileInputStream archivo = new FileInputStream("src/ClaseSystem/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            //Esta es otra forma que funciona con la misma logica que la anterior para agregar configuraciones
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto");

            //Actualizamos nuestras propiedades con setProperties
            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e){
            System.out.println("No existe el archivo = " + e);
        }
    }
}
