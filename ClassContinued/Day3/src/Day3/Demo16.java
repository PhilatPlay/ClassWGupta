package Day3;

public class Demo16 {
	
	public static void main(String[] args) {
        String str = "Hello World";
        str.indexOf('o'); // 4
        str.indexOf('o', 5); // 7
        str.indexOf("ll");
        
        String str2 = "Love this Java class.";
        int xx = str2.indexOf('L'); // 0
        int zz = str2.indexOf('J', 5); // 10
        int yy = str2.indexOf("ss");//18
        
        System.out.println(xx);
        System.out.println(yy);
        System.out.println(zz);
    }
}
