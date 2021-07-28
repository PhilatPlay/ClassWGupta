package Stat;

public class CanAccess {
	static int var1 = 13;;
	  static String var2 = "Hi there.";
	  //This is a Static Method
	  static void disp(){
		  // can access static variables from with in the method.
	      System.out.println("Var1 is: "+var1);
	      System.out.println("Var2 is: "+var2);
	  }
	  public static void main(String args[]) 
	  {
	      disp();
	  }
}
