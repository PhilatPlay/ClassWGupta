import java.util.HashSet;

public class TheHash {
    public static void main(String[] args) {
        HashSet<String> cups = new HashSet<String>();
        cups.add("Cup1");
        cups.add("Cup1");
        cups.add("Cup3");
        cups.add("Cup4");
        cups.add("Cup5");
        System.out.println(cups);

        // Task 1 ***** but hashsets do not maintain insertion order **************************
        cups.add("cup7");
        System.out.println(cups);

        // Task 2 *****
        for (String i : cups) {
            System.out.println(i);

            // Task 3 *****
            int num = cups.size();
            System.out.println("the size: " + num);
            // Task 4 *****
            cups.clear();
            System.out.println(cups);
        }
    }
}
