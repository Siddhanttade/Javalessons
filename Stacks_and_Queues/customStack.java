import java.util.Stack;
public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr=-1;

    public customStack() {
        this(DEFAULT_SIZE);
    }
    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full, cannot push " + item);
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws stackException{
        if(isEmpty()){
            throw new stackException("Stack is empty, cannot pop");
        }
        return data[ptr--];
    }

    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("Stack is empty, cannot peek");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}