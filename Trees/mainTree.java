import java.util.Scanner;
public class mainTree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binaryTree tree = new binaryTree();
        tree.populate(scanner);
        System.out.println("The tree is:");
        //tree.display();
        tree.prettyDisplay();
        scanner.close();
    }
}