package ClaseSystem;

import java.util.Properties;

public class EjemploPropiedadesdeSistema {
    public static void main(String[] args) {

        //La case system nos permite saber todo repecto a nuestro sistema, sus especificaciones, nombres de ususario
        /*versiones de jdk, y mas informacion como veremos acontinuacion, al usar el getProperty resive una llave tipo string para retornar
        *la informacion en especifico que buscamos, estas llaves la encontramos en la documentacion de Oracle */

        //Nombre de ususario del sistema
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        //Ruta usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        //Directorio de trabajo
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        //Verion de Java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        //Listado de propiedades del sistema
        Properties p = System.getProperties();
        p.list(System.out);

    }
}
