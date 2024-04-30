import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        try {
            stack.push(new Record("Data1", 10));
            stack.push(new Record("Data2", 20));
            stack.push(new Record("Data3", 30));
            stack.push(new Record("Data4", 40));

            System.out.println("Top element: " + stack.peek().getField1() + " " + stack.peek().getField2());

            System.out.println("Popping elements:");
            while (true) {
                Record poppedRecord = stack.pop();
                System.out.println(poppedRecord.getField1() + " " + poppedRecord.getField2());
            }
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow: " + e.getMessage());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty: " + e.getMessage());
        }
    }

}