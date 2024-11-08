import org.junit.Test;
import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
public class DiceTest {
    @Test
       public void main() {
        Scanner sc = new Scanner(System.in);
        Dice d = new Dice();
        Dice d20 = new Dice(20);

        d.roll();
        d20.roll();
        System.out.println(d);
        System.out.println(d20);



    }






    }
    //setseed in test class
    //could use a list
