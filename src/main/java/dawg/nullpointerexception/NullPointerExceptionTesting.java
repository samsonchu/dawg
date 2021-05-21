package dawg.nullpointerexception;

public class NullPointerExceptionTesting {

    public static void main(String[] arguments) {
        if ((new A()).b.c.getNumber().equals(1)) {
            System.out.println("number is 1");
        }
    }
}
