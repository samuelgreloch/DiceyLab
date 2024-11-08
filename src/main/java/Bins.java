import javax.xml.transform.Result;
import java.util.HashMap;
    
     class Bins extends Simulation {


        public static void  main(String[] args) {


            HashMap<String, Integer> bin = new HashMap<String, Integer>();
            bin.put("1", sum);
            bin.put("2", sum2);



            System.out.println("1: "+ sum + ":" + "prob" + "***");
            System.out.println("2: "+ sum2 + ":" + "prob" + "***");
        }



    }
//hash map towards simulation

//the numbers to the left are the bins
// empIds.put("1",);
//       empIds.put("2",2);
//
//       System.out.println(empIds);
//
//
//       System.out.println(empIds.get("2"));
//
//       System.out.println(empIds.containsValue(1));