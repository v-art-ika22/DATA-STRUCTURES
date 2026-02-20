package LinkedList;

public class first {
    class Node{
        int value;
        Node next;
        Node(int data){
            this.value=data;
            this.next= null;
        }
    }
    Node head;
    void insertStart(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
    }
    //print
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("end");
    }
    public static void main(String[]args){
        first list = new first();
        list.insertStart(5);
        list.insertStart(6);
        list.insertStart(9);
        list.insertStart(5);
        list.display();
    }
}
