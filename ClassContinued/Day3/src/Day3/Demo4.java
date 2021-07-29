package Day3;

public class Demo4 {
	public static void main(String[] args) {

        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        
        String s4 = "Phil";
        String s5 = "Phil";
        String s6 = new String("Phil");

        System.out.println(s1 == s2);  // true  because both refers to same instance
        System.out.println(s1 == s3);  // false because s3 refers to instance created in normal
//      heap
        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
//      heap

    }
}
