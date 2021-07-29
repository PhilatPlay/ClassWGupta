package Day3;

public class Demo2 {
	public static void main(String[] args) {

        String str = "Hello";
        str.concat("World"); // we are using concat() method to append the string at the end
        System.out.println(str);  // will print Hello only bcoz strings are immutable object
        
        
        // here repeated example
        String str2 = "Get";
        str2.concat(" This done."); 
        System.out.println(str2);  

        String str1 = "Hello";
        str1 = str1.concat("World");
        str2 = str2.concat(" This done");
        System.out.println(str1);
        System.out.println(str2);

    }
}
