import java.util.Random;

public class Dice {

//over load and call in test
   /* public int roll(int x) {
        Random random = new Random();
        x = random.nextInt(10);


        System.out.println("Your roll is " + x);
        return x;*/

        private static int NUM_SIDES;
        public static int value;


        public Dice() {

            NUM_SIDES = 6;
            value = 1;
        }

            public  Dice (int inNumSides) {

            NUM_SIDES = inNumSides;
            value =1;

            }

            public void setValue(int inValue){

            value = inValue;

            }


            public int getValue(){
            return value;


            }

            public int getNumSides(){

            return  NUM_SIDES;

            }

            public  void roll(){

            value = (int)(Math.random()*NUM_SIDES)+1;

            }
        public  String toString(){

            return  "["+value+"]";
        }

    }
//hashset //








