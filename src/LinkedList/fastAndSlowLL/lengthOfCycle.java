package LinkedList.fastAndSlowLL;

public class lengthOfCycle {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    Node temp=head;
    public void insert(int val){
        Node node = new Node(val);
        tail.next=node;
        tail=node;
    }
    public int lengthCycle(Node head){
        int length=0;
        Node fast = head;
        Node slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                Node temp=slow;
                do{
                    temp=temp.next;
                    length++;
                }
                while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
}
