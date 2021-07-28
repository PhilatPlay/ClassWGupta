package Stat;

public class MoreThanOne {
	static int num;
	   static String mystr;
	   //First Static block
	   static{
	      System.out.println("Static Block 1");
	      num = 68;
	      mystr = "Block1";
	  } 
	  //Second static block
	  static{
	      System.out.println("Static Block 2");
	      num = 55;
	      mystr = "Yeah, still me";
	  }
	  public static void main(String args[])
	  {
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	   }
}
