package homework_week_9;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {


    public static void main(String[]arg){
        ArrayList <String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String>c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");


        // comparision

        ArrayList<String> c3= new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.print(c3);


    }
}
