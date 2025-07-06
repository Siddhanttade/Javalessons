import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import AVL.Node;

public class Questions{

    
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left,TreeNode right){
            this.left=left;
            this.val=val;
            this.right=right;
           
        }


    }

    void dfsStack(Node node){
        if(node==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node removed=stack.pop();
            System.out.println(removed.val+" ");
            if(removed.right!=null){
                stack.push(removed.right);
            }
            if(removed.left!=null){
                stack.push(removed.left);
            }
        }
    }
    //Que1:Binary tree level order traversal
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if (root==null) {
            return result;            
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currrentNode=queue.poll();
                currentLevel.add(currrentNode.val);
                if (currrentNode.left!=null) {
                    queue.offer(currrentNode.left);
                }
                if (currrentNode.right!=null) {
                    queue.offer(currrentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    //Que2:Avg of levels in binary tree
    public List<Double> avgOfLevels(TreeNode root){
        List<Double> result=new ArrayList<>();
        if (root==null) {
            return result;            
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            double averageLevel=0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currrentNode=queue.poll();
                averageLevel+=currrentNode.val;
                if (currrentNode.left!=null) {
                    queue.offer(currrentNode.left);
                }
                if (currrentNode.right!=null) {
                    queue.offer(currrentNode.right);
                }
            }
            averageLevel=averageLevel/levelSize;
            result.add(averageLevel);
        }
        return result;
    }

    //Que3:Level order successor of a node
    public TreeNode findSuccessor(TreeNode root,int key){
        List<Double> result=new ArrayList<>();
        if (root==null) {
            return null;            
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            TreeNode currrentNode=queue.poll();
                
            if (currrentNode.left!=null) {
                queue.offer(currrentNode.left);
            }
            if (currrentNode.right!=null) {
                queue.offer(currrentNode.right);
            }
            if (currrentNode.val==key) {
                break;
            }
        }
        return queue.peek();
    }

    //Que4:Binary tree zigzag level order traversal
    public List<List<Integer>> zigZagLevelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if (root==null) {
            return result;            
        }
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;

        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                TreeNode currrentNode=queue.poll();
                currentLevel.add(currrentNode.val);
                if (currrentNode.left!=null) {
                    queue.addLast(currrentNode.left);
                }
                if (currrentNode.right!=null) {
                    queue.addLast(currrentNode.right);
                }
            }
                else{
                    TreeNode currrentNode=queue.poll();
                    currentLevel.add(currrentNode.val);
                    if (currrentNode.left!=null) {
                        queue.addFirst(currrentNode.left);
                    }
                    if (currrentNode.right!=null) {
                        queue.addFirst(currrentNode.right);
                    } 
                } 
            }
            reverse=!reverse; 
            result.add(currentLevel);
        }
        return result;
        }   
        //Que5:Binary tree order traversal in reverse order
     public List<List<Integer>> revLevelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if (root==null) {
            return result;            
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currrentNode=queue.poll();
                currentLevel.add(currrentNode.val);
                if (currrentNode.left!=null) {
                    queue.offer(currrentNode.left);
                }
                if (currrentNode.right!=null) {
                    queue.offer(currrentNode.right);
                }
            }
            result.add(0,currentLevel);
        }
        return result;
        } 
        //Que6:Populating Next Right pointers in Each node
        //here if we use the queue approach T.C would be O(N) so now we should try without this approach
        public TreeNode connect(TreeNode root){
            if(root==null){
                return null;
            }
            TreeNode leftmost=root;
            while(leftmost.next!=null){
                TreeNode current=leftmost;
                while (current!=null) {
                   current.left.next=current.right;
                   if (current.next!=null) {
                    current.right.next=current.next.left;
                   }
                   current=current.next;
                }
                leftmost=leftmost.left;
            }
            return root;
        }

        //Que7:Binary Tree right side view
        
        //Que8:Cousins in binary tree same depth diff parents use function findNode isSibling

        //Que9:Symmetric tree

        //Que10:Diameter of BT length of longest path between any two nodes in the tree may or may not pass through root

        //Que11:Invert a tree

        //Que12:Max depth of BT

        //Que13:Convert sorted arr to BST

        //Que14:Flatten BT to LL generally if we use preorder traversal it takes O(N) T.C and S.C 
        //we can complete this in O(1) T.C by putting elemnts in the right to the rightmost part of left subtree and then adjust accordingly

        //Que15:Validate BST
        
        //Que16:Lowest Common ancestor of two given nodes   
        
        //Que17:return the kth smallest val(use inorder traversal because sorting in ascending order req)

        //Que18:Construct BT from preorder and inorder traversal
        
        //Que19:Serialize(convert BT and put it in file) and Deserialize BT(Comnvert the file again into tree)
        //we req 2 types of traversals in order to make a tree becoz it helps us get idea about the null
        //we have two ways to do so
        //1.Storing preorder and inorder traversal bu the prob is that we are taking extra space 
        //2.doing preorder traversal but storing the null val

        //Que20:Path Sum given a targetsum find a path from root to leaf so that we get the target sum

        //Que21:Sum root to leaf numbers take the nodes of every path a digit is formed and then sum them

        //Que22:BT Max path sum

        //Que23:Path exists from BT from root to leaf

        //Que24:PathSum exists in BT at any Nodes





        
    }

    

