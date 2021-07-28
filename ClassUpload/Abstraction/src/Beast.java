
abstract class Beast{
   //abstract method
   public abstract void sound();
}
//Dog class extends Animal class
class Dog extends Beast{

   public void sound(){
	System.out.println("Bark, Bark");
   }
   
   
   public static void main(String args[]){
	Beast obj = new Dog();
	obj.sound();
   }
}