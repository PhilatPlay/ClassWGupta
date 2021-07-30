import java.util.*;

public class TheList {

    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> philList = new LinkedList<String>();

        // Adding elements to the linked list
        philList.add("Bacon");
        philList.add("Ham");


        // Task 1 *****
        philList.addLast("Pork");

        // Task 2 *****
        philList.forEach(
            (meat) -> System.out.print(" " + meat));

        // Task 3 *****
        for (int i = 1; i < philList.size(); i++) {
            System.out.print(philList.get(i) + " ");
        }

        // Task 4 *****
        for (int i = philList.size(); i < philList.size(); i--) {
            System.out.print(philList.get(i) + " ");
        }

        // Task 4 *****
        philList.add(2, "Lamb");
        System.out.print(philList);

    }
}
