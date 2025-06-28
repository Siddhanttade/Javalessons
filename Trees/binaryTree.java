import java.util.Scanner;
public class binaryTree {
    private Node root;

    public binaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    //insertion
    public void populate(Scanner scanner){
        System.out.println("enter root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("do you want to enter left child of " + node.value );
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter left child of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("do you want to enter right child of " + node.value );
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter right child of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private static void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private static void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}

