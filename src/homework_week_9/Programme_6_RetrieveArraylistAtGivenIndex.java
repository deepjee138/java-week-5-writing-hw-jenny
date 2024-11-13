package homework_week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list

 */

public class Programme_6_RetrieveArraylistAtGivenIndex {

    public static void main(String[] args) {
        ArrayList<String> vegetableList = new ArrayList<>();

        vegetableList.add("cucumber");
        vegetableList.add("Michi");
        vegetableList.add("potato");
        vegetableList.add("onion");
        vegetableList.add("beetroot");
        vegetableList.add("mushroom");
        vegetableList.add("brigle");
        vegetableList.add("potata");


        Scanner scanner = new Scanner(System.in);
        System.out.println("please a enter index number:");
        int index = scanner.nextInt();
        if (index < vegetableList.size()) {
        System.out.println(vegetableList.get(index));
    }else {
            System.out.println("invalid index");
        }
        scanner.close();

    }
}
