public class dynamicQueue extends circularQueue{
    public dynamicQueue() {
        super();    
    }

    public dynamicQueue(int size) {
        super(size);
    }
    //@Override
    public boolean push(int item) {
        //check if stack is full
        if (this.isFull()) {
            //double arr size
            int[] temp = new int[data.length * 2];
            //copy old data to new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length]; // Wrap around to maintain order
            }
            front = 0; // Reset front to the start of the new array
            end = data.length; // Set end to the current size
            data = temp; //point data to the new array
        }
        //call the push method of customStack because stack is not full
        return super.insert(item);
    }
}