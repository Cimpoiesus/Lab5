import java.util.EmptyStackException;

class Stack implements StackInterface {
    private static final int MAX_SIZE = 4;
    private Record[] stackArray;
    private int top;

    public Stack() {
        stackArray = new Record[MAX_SIZE];
        top = -1;
    }

    public void push(Record record) throws StackOverflowError {
        if (top >= MAX_SIZE - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = record;
    }

    @Override
    public Record pop() throws EmptyStackException {
        if (top < 0) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    @Override
    public Record peek() throws EmptyStackException {
        if (top < 0) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }
}