
public class Human {
	//Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class Boy extends Human{
	   //Overriding method
	   public void eat(){
	      System.out.println("I am hungry for food");
	   }
	   public static void main( String args[]) {
	      Boy obj = new Boy();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
}
