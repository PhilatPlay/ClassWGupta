package Day3;

import java.util.Arrays;

class Demo10 {
	
	public static void main(String[] args) {
        String message = "Hello, welcome to java";
        String[] result = message.split("\\,");
        System.out.println(Arrays.toString(result));
        
        String message2 = "Hello, welcome to Java; however, we know you prefer JavaScript.";
        String[] result2 = message2.split("J");
        System.out.println(Arrays.toString(result2));
    }


}