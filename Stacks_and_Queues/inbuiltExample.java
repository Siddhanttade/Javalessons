import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
public class inbuiltExample{
    public static void main(String[] args) {
    Stack<Integer> stack=new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    //if nothing is present in stack and still we pop it, it will throw EmptyStackException

    Queue<Integer> queue=new java.util.LinkedList<>();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    queue.add(40);
    System.out.println(queue.peek());//this will return the element without removing it
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());

    Deque<Integer> deque=new ArrayDeque<>();//Helps to create  
    deque.add(10);
    deque.addLast(20); 
    deque.removeFirst();
    }
}
