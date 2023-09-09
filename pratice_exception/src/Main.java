class Base extends Exception {}
class Derived extends Base  {}

public class Main {
    public static void main(String args[]) {
        // some other stuff
        try{
            System.out.print("hello"+" "+1/0);
        }
        catch (ArithmeticException e){
            System.out.print("world");
        }

    }
} 