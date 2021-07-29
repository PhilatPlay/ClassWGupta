package Day3;

public class Demo27 {
    public static void main(String[] args) {
        try {
            print1();
        }catch (StackOverflowError ex){
            System.out.println(ex.getMessage());
        }
    }
/// yeah too much going to the stack here... hence "stackOverflow"
    public static void print1(){
        print2();
    }

    public static void print2(){
        print1();
    }
}
