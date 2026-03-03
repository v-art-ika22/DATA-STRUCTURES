package LinkedList.CircularLinkedList;

public class insert {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    Node head;
    Node tail;
    //insert after tail
    public void insertAfterTail(int data){
        Node node = new Node(data);
        if(head==null){//if list is empty
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void deletee(int value){

        Node temp=head;
        if(temp.value==value){
            head=temp.next;
            tail=head;
            return;
        }do {
            Node n = temp.next;
            if (n.value == value) {
                temp.next = n.next;
               break;

            }
            temp = temp.next;}
            while (temp != head) ;

        }






    public void display(){
        Node temp=head;
        if(head==tail){
            System.out.print(temp.value+"->");
            temp=temp.next;
            //return;
        }
        while(temp!=tail){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }System.out.print("end");
    }
    public static void main(String[]args){
        insert list = new insert();
        list.insertAfterTail(60); list.insertAfterTail(61);
        list.insertAfterTail(62); list.insertAfterTail(63);
        list.insertAfterTail(64); list.insertAfterTail(65);
        list.deletee(620);
        list.display();
    }
}
