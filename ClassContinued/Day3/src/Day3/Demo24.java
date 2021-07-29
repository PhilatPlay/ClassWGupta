package Day3;

public class Demo24 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
        	System.out.println("Get this out; no exceptions!");
            e.printStackTrace();
        } finally {
        	System.out.println("Cool!");
        }
    }

    public static void doSomething() throws Exception {
        doSomethingElse();
    }

    private static void doSomethingElse() throws Exception {
        doSomethingSomethingElse();
    }

    private static void doSomethingSomethingElse() throws Exception {
        throw new Exception();
    }
}

