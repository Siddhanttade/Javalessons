public class queueMain {
    public static void main(String[] args) throws Exception{
        customQueue queue = new customQueue(5);
        
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.display(); // Should display: 10 20 30 40 50 END

        System.out.println(queue.remove()); // Should remove and return 10
        queue.display(); // Should display: 20 30 40 50 END
    }
}