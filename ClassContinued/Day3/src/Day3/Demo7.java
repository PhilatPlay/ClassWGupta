package Day3;

public class Demo7 {
	public static void main(String[] args) {
        String s1 = "hello";
        String s2 = " world";
        String s3 = s1.concat(s2);
        
        String s4= s2.concat(s1);
        String s5 = s1.concat(s2);
        
        System.out.println(s3); // hello world
        System.out.println(s4);
        System.out.println(s5);
    }
}
