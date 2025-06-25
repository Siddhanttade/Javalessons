public class dynamicStack extends customStack {
    public dynamicStack() {
        super();    //calls the default constructor of customStack without taking an argument
    }

    public dynamicStack(int size) {
        super(size);//calls the parameterized constructor of customStack with the given size
    }

    @Override
    public boolean push(int item) {
        //check if stack is full
        if (this.isFull()) {
            //double arr size
            int[] temp = new int[data.length * 2];
            //copy old data to new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp; //point data to the new array
        }
        //call the push method of customStack because stack is not full
        return super.push(item);
    }
}