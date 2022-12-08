package FlujosDeControl;

public class TiposDeFlujo {
    public static void main(String[] args) {

        //Clasico if

        //Clasico else

        //Clasico else-if

        //switch case
        /*La sentencia que utilizamos para dar inicio es el switch, donde no contamos con un true o un false
        * si no con una variable que puede ser int, byte, short, char, String y enum, y esta tenga un valor
        * y esta tenga un valor lo cual determinara el case que se ejecutara:
        *
        *       switch(variable){
        *          case valor1:
        *            //Se ejecuta sentencia 1
        *          break; //Opcional para no ejecutar en cascada y que esta salga al encontrar su case
        *          case valor2:
        *            //Se ejecuta sentencia 2
        *          break;
        *          case valor3:
        *            //Se ejecuta sentencia 3
        *          break;
        *       defaut:
        *          //Si no existe una condicion valida se ejecuta un defaut
        * */

        //Ejemplo

        int num = 3;
        switch (num){
            case 0:
                System.out.println(0);
                break;
            case 2:
                System.out.println("num = " + num);
                break;
            case 3:
                System.out.println("num = " + num);
                break;
            default:
                System.out.println("num = " + num);
        }
    }
}
