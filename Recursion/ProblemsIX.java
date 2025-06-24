public class ProblemsIX{
    private Node head;
    private Node tail;
    private int size;
    public ProblemsIX(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertlast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;

    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertlast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value, temp.next);
        temp.next=node;
        size++;

    }
    
    public int deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public void insertRec(int value,int index) {
        head = insertRec(value,index,head);
        size++;
    }

    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            return new Node(value, node);
        }
        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.value;
        tail=secondLast;
        tail.next=null;
        return value;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }

        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        return value;
    }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    //Question1:Remove duplicate node from sorted linked list
    public void removeDuplicates(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next = node.next.next; // Skip the duplicate node
                size--; // Decrease size since we removed a node
            } else {
                node = node.next; // Move to the next node
            }
        }
        tail=node;
        tail.next=null;
    }

     //Question2:Merge two sorted LL
        public static ProblemsIX merge(ProblemsIX first, ProblemsIX second){
            Node f = first.head;
            Node s=second.head;

            ProblemsIX ans=new ProblemsIX();
            while(f!=null && s!=null){
                if(f.value < s.value){
                    ans.insertlast(f.value);
                    f = f.next;
                } else {
                    ans.insertlast(s.value);
                    s = s.next; 
            }
            while(f!=null){
                ans.insertlast(f.value);
                f = f.next;
            }
            while(s!=null){
                ans.insertlast(s.value);
                s = s.next;
            }
        }
            return ans;
        }
    
    //Question3:LL cycle 1=>2=>3=>4 and 4 again points to 2 remember:it is an important approach
    public static boolean hasCycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    //Question4:Find the length of the cycle
    public static int lengthCycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                Node temp=slow; 
                int length=0;
            }
            do {
                temp = temp.next;
                length++;
            } while (temp != slow);
            return length; // Length of the cycle
        }
        return 0; // No cycle
    }
    //Question5:Find the starting node of the cycle 
    public static Node findStartingNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                // Cycle detected, now find the starting node
               
                while(temp!=slow){
                    length=lengthCycle(head);
                    break;
                }
            }
        }
        if(length==0){ 
            return null; // No cycle
            }

        Node f=head;
        Node s=head;
        
        while (length > 0) {
            s = s.next;
            length--;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return f; // Starting node of the cycle
    }

    //Question6:Happy number after sometime becomes 1 example 19 1^2 + 9^2 = 82 and keep adding the squares further we get 1
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findSquareSum(slow);
            fast=findSquareSum(findSquareSum(fast));
        }while(slow!=fast);
        if(slow==1){
            return true; // Happy number
        }
        return false; // Not a happy number

    }
    private int findSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    //Question7:Mid of LL
    public static Node findMid(Node head){
        Node s= head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }   
    //Question8:Sort LL using Merge Sort make merge and getMid function
    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: if the list is empty or has one node
        }
        
        Node mid = getMid(head); // Find the middle node
        Node left = sortList(head); // Sort the left half
        Node right = sortList(mid); // Sort the right half
        
        return merge(left, right); // Merge the sorted halves
    }
    Node merge(Node first, Node second) {
        Node dummy = new Node();
        Node tail = dummy;
        while (first != null && second != null) {
            if (first.value < second.value) {
                tail.next = first;
                first = first.next;
                tail = tail.next;
            } else {
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        }
        tail.next = (first != null) ? first : second;
        return dummy.next; // Return the merged list
    }
    
    Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid node
    }

    //sorting using bubble sort
    public void bubbleSort(){
        bubbleSort(size-1, 0);
    }
    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return; // Base case: if we have sorted all rows
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);
            if (first.value > second.value) {
                // Swap the values
                if(first==head){
                    head=second; // Update head if first is the head
                    first.next = second.next; // Link first to the next node
                    second.next = first; // Link second to first
                }else if(second==tail){
                    Node prev = get(col - 1);
                    prev.next = second; // Link previous node to first
                    tail=first; // Update tail if second is the tail
                    second.next = tail; // 
                    first.next = null; // Set first's next to null
                }else{
                    Node prev = get(col - 1);
                    prev.next = second; // Link previous node to second
                    second.next = first; // Link second to first
                    first.next = second.next; // Link first to the next node
                }
            }
            bubbleSort(row, col + 1); // Move to the next column
        } else {
            bubbleSort(row - 1, 0); // Move to the next row
        }
    }

    //Question9:Reverse LL using recursion
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return ;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    //Question10:Reverse LL using iteration(inplace)
    public void reverseIteration(Node node){
        if(size<2 || head==null){
            return;
        }
        Node prev=null;
        Node curr=head;
        Node next=curr.next;

        while(curr!=null){
            curr.next=prev; // Reverse the link
            prev=curr; // Move prev to current
            curr=next; // Move to next node
            if(next!=null){
                next=next.next; // Update next
            }
        }
        head=prev; // Update head to the new first node
    }
    //Question11:Reverse a part of LL
    public Node reverseBetween(Node head,int left,int right){
        if(left==right){
            return head; // No need to reverse if left equals right
        }
        //skip the first left-1 nodes
        Node curr=head;
        Node prev=null;
        for (int i = 0;curr!=null && i < left - 1; i++) {
            prev=curr;
            curr=curr.next;
        }
        Node last=prev;
        Node newEnd=curr;

        //reverse the nodes between left and right
        Node next=curr.next;
        for(int i=0;curr!=null && i<right-left+1;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev; // Connect the last node before the reversed part to the new head
        } else {
            head=prev; // If we reversed from the start, update head
        }
        newEnd.next=curr; // Connect the end of the reversed part to the next node  
        return head; // Return the modified head
    }
    //Question12:Palindrome LL
    public boolean isPalindrome(Node head){
        Node mid=findMid(head);
        Node headSecondHalf=reverse(mid);
        Node rereverseHead=headSecondHalf; // Store the head of the reversed second half
        //compare both the halves
        while(head!=null && headSecondHalf!=null){
            if(head.value!=headSecondHalf.value){
                return false; // Not a palindrome
            }
            head=head.next;
            headSecondHalf=headSecondHalf.next;
        }
        reverse(rereverseHead); // Reverse the second half back to original order
        return head==null || headSecondHalf==null; // If both halves are equal, return true
    }

    //Question13:Reorder LL 1-2-3-4-5 becomes 1-5-2-4-3
    public void reOrder(Node node){
        if(head==null|| head.next==null){
            return; // No need to reorder if the list is empty or has one node
        }
        Node mid=findMid(node); // Find the middle node
        Node hs=reverse(mid); // Reverse the second half of the list
        Node hf=head; // Pointer to the first half

        //arrange
        while(hf!=null && hs!=null){
            Node temp=hf.next;
            hf.next=hs; // Link the first half to the second half
            hf=temp; // Move to the next node in the first half

            temp=hs.next;
            hs.next=hf; // Link the second half to the next node in the first half
            hs=temp; // Move to the next node in the second half
        }

        //nxt of tail to null
        if(hf!=null){
            hf.next=null; // If there are remaining nodes in the first half, set the next to null
        }
    }

    //Question15:Reverse nodes on k group
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) {
            return head; // No need to reverse if the list is empty or k is less than or equal to 1
            }
        Node curr=head;
        Node prev=null;

        while(true){
       
        Node last=prev;
        Node newEnd=curr;

        //reverse the nodes between left and right
        Node next=curr.next;
        for(int i=0;curr!=null && i<k;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev; // Connect the last node before the reversed part to the new head
        } else {
            head=prev; // If we reversed from the start, update head
        }
        newEnd.next=curr; // Connect the end of the reversed part to the next node  
        if(curr==null){
            break; // If we reach the end of the list, exit the loop
        }
        prev=newEnd; // Update prev to the new end of the reversed part
       }   
       return head; // Return the modified head  
    }

    //Question16: if we want to reverse alternately skipping k nodes
    public Node reverseAlternateKGroup(Node head, int k) {
        if (head == null || k <= 1) {
            return head; // No need to reverse if the list is empty or k is less than or equal to 1
            }
        Node curr=head;
        Node prev=null;

        while(true){
       
        Node last=prev;
        Node newEnd=curr;

        //reverse the nodes between left and right
        Node next=curr.next;
        for(int i=0;curr!=null && i<k;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev; // Connect the last node before the reversed part to the new head
        } else {
            head=prev; // If we reversed from the start, update head
        }
        newEnd.next=curr; // Connect the end of the reversed part to the next node  
        for(int i=0;curr!=null && i<k;i++){
            prev=curr; // Move prev to the next node
            curr=curr.next; // Move curr to the next node
        }  
       return head; // Return the modified head  
        }
    }

    //Question17:Rotate LL k times
    public Node rotate(Node head,int k) {
        if (head == null || head.next == null || k <= 0) {
            return head; // No need to rotate if the list is empty, has one node, or k is less than or equal to 0
        }
        Node last=head;
        int size=1; // Initialize size to 1 since we have at least one node
        while(last.next!=null){
            last=last.next; // Traverse to the last node
            size++; // Increment size for each node
        }
        last.next=head; // Make the list circular by connecting the last node to the head
        int rotations=k % size; // Calculate effective rotations
        int skip=size-rotations; // Calculate the number of nodes to skip
        Node newTail=head; // Initialize newTail to head
        for (int i = 0; i < skip - 1; i++) {
            newTail = newTail.next; // Move newTail to the node before the new head
        }
        Node newHead = newTail.next; // Set newHead to the node after newTail
        newTail.next = null; // Break the circular link by setting newTail's next to null
        return newHead; // Return the new head of the rotated list
      
    }
}




            
