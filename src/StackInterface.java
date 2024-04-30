import java.util.EmptyStackException;

interface StackInterface {
    Record pop() throws EmptyStackException;
    Record peek() throws EmptyStackException;
    boolean isEmpty();
}