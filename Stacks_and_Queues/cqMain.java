public class cqMain{
    public static void main(String[] args) throws Exception {
        circularQueue cq = new circularQueue(5);
        
            cq.insert(10);
            cq.insert(20);
            cq.insert(30);
            cq.insert(40);
            cq.insert(50);
            cq.display(); // Should display all elements in the queue
            
            System.out.println(cq.remove()); // Should remove and return 10
            cq.insert(100); // Should insert 100
            cq.display(); // Should display the updated queue
    }
}