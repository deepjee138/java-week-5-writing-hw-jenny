package homework_week_9;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * /*
  * Create a HashMap object called people that will store String keys and Integer values:
  * And use for each loop to iterate the value from Map.
  *  */


public class Programme_9_HashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> peopleNumber = new HashMap<>();
        // add key value

        peopleNumber.put("Monday",102);
        peopleNumber.put("Tuesday",103);
        peopleNumber.put("Wednesday",104);
        peopleNumber.put("Friday",105);
        peopleNumber.put("Monday",106);
        peopleNumber.put("Monday",107);
        peopleNumber.put("Sundaty",108);


        for (Map.Entry<String,Integer>peoplenum : peopleNumber.entrySet()){
            System.out.println(peoplenum.getKey()+ " = " +peoplenum.getValue());
        }
    }
}
