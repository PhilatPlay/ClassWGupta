package Day3;

public class Demo9 {
	public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "HelloWorld";
        
        String str5 = "Party";
        String str6 = "House";
        String str7 = "PartyHouse";
        
        String str9 = str5 + str6;
        
        System.out.println(str7.equals(str9));
        System.out.println(str7 == str9);
        
        String str4 = str1 + str2;

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
    }
}
