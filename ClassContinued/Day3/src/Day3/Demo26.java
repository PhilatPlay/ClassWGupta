package Day3;

/**
 * NullPointerException
 *
 * Throwable -> Exception -> RunTimeException
 * */

class Customer{
    public void display(){
        System.out.println("display... Ok. Yeah I get this and see what was causing the error, but more importantly"
        		+ " how to handle it.");
    }
}

public class Demo26 {
    public static void main(String[] args) {
        String str = "Mark";
        System.out.println(str.length());

//        String str2 = null;
//        try{
//            System.out.println(str2.length());
//        }catch (NullPointerException ex){
//            System.out.println(ex.getMessage());
//        }
//
        Customer customer1 = new Customer();
        customer1.display();

//        Customer customer2 = null;
//        customer2.display();
    }
}
