package LinkedList.DoublyLinkedList;

public class insert {
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
    Node head;
    public void inserttFirst(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            node.prev=null;
            node.next=null;
        }
        else{
            node.next=head;
            node.prev=null;
            head.prev=node;
            head=node;
        }
    }
    public void insertAfterParticular(int value,int data){
        Node temp=head;
        Node node = new Node(data);
        while(temp!=null&&value!=temp.value){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("value not found");
            return;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        temp=node;


    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("end");

    }
    public void addLast(int value){
        Node node = new Node(value);
        Node temp=head;
        Node last = null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        if(head==null){
            head=node;
            node.next=null;
            node.prev=null;
            return;
        }
        node.next=null;
        last.next=node;
        node.prev=last;

    }
    public static void main(String[]args){
        insert list = new insert();
        list.addLast(12);
        list.addLast(10);
        list.addLast(14);
        list.addLast(126);
        list.insertAfterParticular(126,11);
        list.display();

    }
}
