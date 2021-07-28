
public abstract class CantInstantiate {
	public void myMethod(){
	      System.out.println("Hello");
	   }
	   abstract public void anotherMethod();
	}
// can't instantiate unless abstract itself 
//plus be in its own file.

//	public abstract class Demo extends CantInstantiate{
//
//	   public void anotherMethod() { 
//	        System.out.print("Abstract method"); 
//	   }
//	   public static void main(String args[])
//	   { 
//	      //error: You can't create object of it
//		   CantInstantiate obj = new CantInstantiate();
//	      obj.anotherMethod();
//	   }
//}
