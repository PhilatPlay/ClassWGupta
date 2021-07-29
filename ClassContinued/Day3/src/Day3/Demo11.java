package Day3;

public class Demo11 {
	public static void main(String[] args) {
		
		
        StringBuffer sb = new StringBuffer("Testing");
        StringBuffer sb2 = new StringBuffer(" Again!");
        StringBuffer sb4 = sb.append(sb2);
        System.out.println(sb4);  // Testing Again

    }
}
