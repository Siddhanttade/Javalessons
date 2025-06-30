public class segMain{
public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        segTree tree = new segTree(arr);
        System.out.println("Segment Tree created successfully.");
        tree.display();
        System.out.println(tree.query(1,6)); // Query sum from index 0 to 3
    }
}