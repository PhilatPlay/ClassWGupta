import java.util.*;
public class TheTree {

    public static void main(String args[]) {
        // Create a tree set ***************** already used "colors"
        TreeSet lt = new TreeSet();

        // Add elements to the tree set

        // Task 1 *****
        lt.add("C");
        lt.add("A");
        lt.add("B");
        lt.add("E");
        lt.add("F");
        lt.add("D");
        System.out.println(lt);

        // Task 2 *****
        for (Object i : lt) {
            System.out.println(i);
        }

        TreeSet lt2 = new TreeSet();

        // Add elements to the tree set
        lt2.add("G");
        lt2.add("H");
        lt2.add("I");
        lt2.add("J");
        lt2.add("K");
        lt2.add("L");

        // Task 3 *****
        lt.addAll(lt2);
        System.out.println(lt);

        // Task 4 *****
        Set<Integer> ltr = lt.descendingSet();
        Iterator<Integer> it = ltr.iterator();
        System.out.println("Reverse set contains: ");
        while(it.hasNext()){
            System.out.println( it.next() );
        }

        // Task 5 *****
        System.out.println("first: " + lt.first() + ",   Last: " + lt.last());
    }
}
