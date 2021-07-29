package Day3;

public class Demo13 {
	public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  // 16
        sb.append("Hello");
        System.out.println(sb.capacity());  // 16
        sb.append("Welcome to java class, adds Have a nice day");
        System.out.println(sb.capacity());
        
        
        // seems to add by character after (16 x 2) + 2 = 34
        sb.append("");
        System.out.println(sb.capacity());
        sb.append("Welcome to java class, adds Have a nice day ...Welcome to java class, adds Have a nice day");
        System.out.println(sb.capacity());// 138 now


    }
}
