import java.util.Random;

public class Dice {


    public int roll(int x) {
        Random random = new Random();
        x = random.nextInt(4);


        System.out.println("Your roll is " + x);
        return x;
    }

}




