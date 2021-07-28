package Stat;

public class JavaExample {
	static int num;
	   static String mystr;
	   static{
	      num = 55;
	      mystr = "I'm geting this static stuff.";
	   }
	   
	   // added another block...
	   static{
		      num = 35;
		      mystr = "Hmmm.. geting used to some of this static stuff.";
		   }
	   public static void main(String args[])
	   {
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	   }
}
