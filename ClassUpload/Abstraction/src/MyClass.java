
abstract class MyClass {
	public void disp(){
	     System.out.println("Concrete method of parent class if I can run this crap!");
	   }
	   abstract public void disp2();
	}

	class Demo extends MyClass{
	   /* Must Override this method while extending
	    * MyClas
	    */
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
	       Demo obj = new Demo();
	       obj.disp2();
	   }
}
