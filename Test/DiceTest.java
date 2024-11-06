import org.junit.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
public class DiceTest {
    @Test

    public void diceroll() {
     var rolling = new Dice();
    assertEquals(1,rolling.roll(1));

    }
}