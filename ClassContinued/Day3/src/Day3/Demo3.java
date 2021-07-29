package Day3;

public class Demo3 {
	public static void main(String[] args) {

        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        String s4 = "Paul";
        
        String s6 = "Phil";
        String s7 = new String("Phil");
        String s8 = "Phil";
        String s9 = "Paul";
        
        // see ... only compares values not data type...
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); //  true
        System.out.println(s1.equals(s4)); // false
        
        System.out.println(s6.equals(s7)); // true
        System.out.println(s6.equals(s8)); //  true
        System.out.println(s6.equals(s9)); // false
        

        String s5 ="MARK";
        System.out.println(s1.equals(s5)); // false
        System.out.println(s1.equalsIgnoreCase(s5)); // true

    }
}
