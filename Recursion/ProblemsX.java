import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class ProblemsX{ //queueUsingStacks=ProblemsX
    //Que1:Implement queue using stacks
    //here tc is O(1) for push and O(n) for pop because for popping item we need to traverse all elements in stack1 and push them to stack2
    //this is insert efficientqueue
   
    // private Stack<Integer> first;
    // private Stack<Integer> second;

    // public ProblemsX(){
    //     first = new Stack<>();
    //     second = new Stack<>();
    // } 

    // public void add(int x){
    //     first.push(x);
    // }

    // public int remove() throws Exception{
    //     while(!first.isEmpty()){
    //         second.push(first.pop());
    //     }
    //     int removed = second.pop();
    //     while(!second.isEmpty()){
    //         first.push(second.pop());   
    //     }
    //     return removed;
    // }

    // public int peek() throws Exception{
    //     while(!first.isEmpty()){
    //         second.push(first.pop());
    //     }
    //     int peeked = second.peek();
    //     while(!second.isEmpty()){
    //         first.push(second.pop());
    //     }
    //     return peeked;
    // }
    
    // public boolean isEmpty(){
    //     return first.isEmpty();
    // }

    //removeEfficientQueue
    //here tc is O(n) for push and O(1) for pop because for

    // private Stack<Integer> first;
    // private Stack<Integer> second;

    // public ProblemsX(){
    //     first = new Stack<>();
    //     second = new Stack<>();
    // } 

    // public void add(int x) throws Exception{
    //     //push to first stack
    //     while(!first.isEmpty()){
    //         second.push(first.pop());
    //     }
    //     first.push(x);
    //     while(!second.isEmpty()){
    //         first.push(second.pop());
    //     }
        
    // }

    // public int remove() throws Exception{
    //     return first.pop();
    // }

    // public int peek() throws Exception{
    //     return first.peek();
    // }

    // public boolean isEmpty(){
    //     return first.isEmpty();
    // }

    //Question2:Two stack problem
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     for (int i = 0; i < t; i++) {
    //         int n= sc.nextInt();
    //         int m= sc.nextInt();
    //         int x= sc.nextInt();
    //         int[] a = new int[n];
    //         int[] b = new int[m];
    //         for (int j = 0; j < n; j++) {
    //             a[j] = sc.nextInt();    
    //         }
    //         for (int j = 0; j < m; j++) {
    //             b[j] = sc.nextInt();    
    //         }
    //         System.out.println(twoStack(x, a, b));
    //     }
    // }
    // public static int twoStack(int x,int[] a,int[] b){
    //     return twoStack(x, a, b,0,0)-1;
    // }
    // private static int twoStack(int x,int[] a,int[] b,int sum,int count){
    //     if(sum>x){
    //         return count;
    //     }
    //     if(a.length==0 || b.length==0){
    //         return count;
    //     }
    //     int ans1=twoStack(x, Arrays.copyOfRange(a, 1, a.length), b,sum+a[0],count+1);
    //     int ans2=twoStack(x, a, Arrays.copyOfRange(b, 1, b.length),sum+a[0],count+1);
    //     return Math.max(ans1, ans2);
    // }

    //Question3:valid parenthesis
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (char ch : s.toCharArray()) {
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }else 
            {
                if (ch==')') {
                   if (stack.isEmpty()||stack.pop()!='(') {
                    return false; 
                   }
                }
                if (ch=='}') {
                    if (stack.isEmpty()||stack.pop()!='{') {
                    return false; 
                   }
                }
                if (ch==']') {
                    if (stack.isEmpty()||stack.pop()!='[') {
                    return false; 
                   }
                }
            }
        } 
        return stack.isEmpty();
    }
    //Question4:min add to make valid parenthesis
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } 
                else{
                    stack.push(ch);
                    }
                }
                else{
                stack.push(ch);
                    }
        }   return stack.size();
    }
}



