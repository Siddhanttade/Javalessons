public class Main{
    public static void main(String[] args){
        LL1 List=new LL1();
        List.insertFirst(3);
        List.insertFirst(3);
        List.insertFirst(3);
        List.insertFirst(3);
        List.insertFirst(3);
        List.insertlast(2);
        List.insert(100, 3);
        System.out.println(List.deleteFirst());
        List.display();
        System.out.println(List.deleteLast());
        List.display();
        System.out.println(List.delete(3));
        List.display();

    }
}