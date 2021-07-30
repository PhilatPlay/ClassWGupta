import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;

// Question Answered 7/29/21
public class QuestionsDemo {

    public static void main(String[] args) {

        // Task #1 *****
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Red");

        System.out.println(colors);

        // Task #2 *****
        for (String color : colors) {
            System.out.println(color);
        }

        // Task #3 *****
        colors.add(1, "limeGreen");
        System.out.println(colors);

        // Task #4 *****
        String yellow = colors.get(3);
        System.out.println(yellow);

        // Task #5 *****
        colors.set(0,"BlueGreen");
        System.out.println(colors);

        // Task #6 *****
        colors.remove(2);
        System.out.println(colors);

        // Task #7 *****
        Boolean does = colors.contains("Red");
        System.out.println(does);

        // Task #8 *****
        Collections.sort(colors);
        System.out.println(colors);

        // Array for Task #9 *****
        ArrayList<String> moreColors = new ArrayList<>();
        moreColors.add("Beige");
        moreColors.add("Black");
        moreColors.add("Brown");

        // Task #9 *****
        colors.addAll(moreColors);
        System.out.println("Both Arrays in colors : " + colors);

        // Task #10 *****
        Collections.shuffle (colors);
        System.out.println("colors shuffled: " + colors);

        // Task #11 *****
        Collections.reverse(colors);
        System.out.println("reversed: " + colors);

        // Task #12 *****
        Collections.reverse(colors);
        System.out.println("reversed: " + colors);

        // Task #13 *****
        Collections.swap(colors, 1, 4);
        System.out.println("colors colors 1 and 4 swapped: " + colors);


        // HashMaps Exercises: *************************************************
        // Created a HashMap object called belongings

        HashMap<String, String> belongings = new HashMap<String, String>();

        // HashMap Task #1 *****
        belongings.put("shirt", "Bob");
        belongings.put("pants", "Jim");
        belongings.put("shoes", "Frank");
        belongings.put("socks", "Phil");
        System.out.println(belongings);

        // HashMap Task #2 *****
        int keyValueCount = belongings.size();
        System.out.println(keyValueCount);

        // HashMap Task #3 *****
        HashMap<String, String> belongings2 = new HashMap<String, String>();

        // HashMap Task #1 *****
        belongings2.put("belt", "Pablo");
        belongings2.put("tie", "Rico");
        belongings2.put("shorts", "Tyrone");

        // HashMap Task #2 *****
        belongings.putAll(belongings2);
        System.out.println(belongings);

        // HashMap Task #3 *****
        List<String> subLi = colors.subList(0, 3);
        System.out.println(subLi);
    }
}
