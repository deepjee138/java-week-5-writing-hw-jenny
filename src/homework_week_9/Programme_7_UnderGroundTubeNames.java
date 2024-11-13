package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList<String>tubeName = new ArrayList<>();
        tubeName.add("Bakerloo line");
        tubeName.add("central line");
        tubeName.add("circle line");
        tubeName.add("District line");
        tubeName.add("picadelly");
        tubeName.add("victoria city");
        tubeName.add("Bakerloo and city line");
        if (tubeName.isEmpty()){
            System.out.println("give array list is empty");
        }else {
            System.out.println("given array list is not empty");
        }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
