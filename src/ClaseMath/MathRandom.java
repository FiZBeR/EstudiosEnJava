package ClaseMath;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {

        //Este metodo nos ayuda a seleccionar un nuero aleatorio entre 0 y 1
        double random = Math.random();
        System.out.println("random = " + random);

        Random randomObj = new Random();
        int randonInt = randomObj.nextInt();
        int randonInt2 = randomObj.nextInt(70);

        System.out.println("randonInt = " + randonInt);
        System.out.println("randonInt2 = " + randonInt2);
    }
}
