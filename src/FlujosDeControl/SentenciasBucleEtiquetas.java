package FlujosDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        /*Las etiquetas pueden ser marcadas en cualquier parte del for y solo basta con colocarle un nombre
        * a esta seguida de dos puntos */

        //Etiqueta
        bucle1:
        for(int i = 0; 1 < 5; i++){


            for (int j = 0; j < 5; j++){
                if( i == 2){
                    continue bucle1;
                }
                System.out.println("i = " + i);
            }
        }
    }
}
