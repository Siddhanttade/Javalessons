public class circularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end=0;
    protected int front=0;
    private int size=0;

    public circularQueue() {
        this(DEFAULT_SIZE);
    }
    public circularQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length ;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end++;
        end=end%data.length; // Wrap around if end exceeds array length
        size++; // Increase the size of the queue
        return true;
    }
     public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot remove");
        }

        int removedItem = data[front];
        front++;
        front=front%data.length; // Wrap around if front exceeds array length     
        size--;
        return removedItem;
        }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot peek");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i=front;
        do{
            System.out.println(data[i] + "-> ");
            i++;
            i=i%data.length; // Wrap around if i exceeds array length
        }while(i != end);
        System.out.println("END");
    }
}