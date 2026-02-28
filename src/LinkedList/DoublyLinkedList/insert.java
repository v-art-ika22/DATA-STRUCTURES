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
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("end");

    }
    public static void main(String[]args){
        insert list = new insert();
        list.inserttFirst(12);
        list.inserttFirst(10);
        list.inserttFirst(14);
        list.inserttFirst(126);
        list.display();

    }
}
