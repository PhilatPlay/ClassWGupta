package Day3;

public class Demo29 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
//******Yeah, I understand this. It seems the function is simple "overloaded" with options.

        try{
            c = a / b;
        }
        catch (ArithmeticException ex){

        }
        catch (NullPointerException | NumberFormatException e){

        }
        catch (Exception ex){

        }

    }
}
