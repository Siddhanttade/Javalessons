public class stackMain {
    public static void main(String[] args) throws stackException {
        customStack stack = new customStack(5);
        
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //System.out.println(stack.pop());; this throws an exception because the stack is empty
        dynamicStack dynamicStack = new dynamicStack(5);
        dynamicStack.push(0);
        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        dynamicStack.push(4);
        dynamicStack.push(5); // This will trigger the dynamic resizing of the stack
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop()); // This will not throw an exception because the stack is dynamic and can grow
        
    }
}