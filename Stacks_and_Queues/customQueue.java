public class customQueue{
    //using only one ptr
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end=0;

    public customQueue() {
        this(DEFAULT_SIZE);
    }
    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot remove");
        }

        int removedItem = data[0];

        // Shift all elements to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--; // Decrease the end pointer
        return removedItem;
        }
        
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot peek");
        }
        return data[0];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0; i<end; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end == data.length ;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}