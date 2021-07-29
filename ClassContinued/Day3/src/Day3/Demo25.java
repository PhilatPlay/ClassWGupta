package Day3;

/**
 * ArrayIndexOutOfBoundException
 *
 * Throwable -> Exception -> RuntimeException -> IndexOutOfBound
 *
 * */

public class Demo25 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        	// and using multiple try catch blocks here...
        try{
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println(a[2]);
        }catch (ArrayIndexOutOfBoundsException ex){
        	// and then no exception here...! ***************************
            System.out.println(ex.getMessage());
        }
        	// first exception not take out application ... exception handled.
    }
}
