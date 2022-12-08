package ValorReferencia;
class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}


public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Heidy");
        System.out.println("Iniciamos el metodo main");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Antes de llamar el metodo test");
        test(persona);
        System.out.println("Despues de llamar el metodo test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("finaliza el metodo main con los datos la persona modificado ");
    }

    public static void test(Persona persona){
        System.out.println("Inicializamos el metodo test");
        persona.modificarNombre("Ambar");
        System.out.println("Finaliza el metodo test ");
    }

}
