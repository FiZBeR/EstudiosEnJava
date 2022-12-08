package ValorReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("comenzamos el metodo main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo main con el valor de i = " + i);
    }

    public static void test(int i){
        System.out.println("comenzamos el metodo test con i  = " + i);
        i = 35;
        System.out.println("Finaliza con el nuevo valor de i = " + i);
    }

}
