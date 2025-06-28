public class BSTMain {
    public static void main(String[] args) {
        binSearchTree bst= new binSearchTree();;
        int[] nums = {10, 5, 15, 3, 7, 12, 18};
        bst.populate(nums);
        bst.display();
    }
}
