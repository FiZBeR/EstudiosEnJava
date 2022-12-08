package FlujosDeControl;

public class SentenciasBuquesEtiquetasBuscar {
    public static void main(String[] args) {

        //Hayar x veces la letra
        String frase = "tres tirstes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letras = 't';

        for (int i = 0; i < max; i++){
            if(frase.charAt(i) != letras){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '" + letras + "' en la frase");

        //Hayar x veces la palabra
        String frase1 = "trigo tres tristes tigres tragan trigo en un trigal trigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase1.length();

        int cantidadd = 0;
        char letra = 't';

        buscar:
        for (int i = 0; i < maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }

            cantidadd++;
        }
        System.out.println("Encontrado = " + cantidadd + " veces el palabra '" + palabra + "' en la frase");
    }
}
