package LinkedList.LinkedRecursion;

import LinkedList.insert;

public class InsertUsingRecursion {
    class Node{
        int value;
        Node next;
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        Node(int value){
            this.value=value;
        }
    }
    Node head;

    Node tail;
    int size=0;
    public void insertRec(int data,int index){
         head=insertRecc(data,index,head);

    }
    public Node insertRecc(int value,int index,Node node){
        if(index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next=insertRecc(value,index-1,node.next);
        return node;
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;hhhhh
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }System.out.print("end");
    }

    public static void main(String[]args){
        InsertUsingRecursion list = new InsertUsingRecursion();
        list.insertFirst(56);
        list.insertFirst(57);
        list.insertFirst(58);
        list.insertFirst(59);
        list.insertFirst(54);
        list.insertRec(60,2);
        list.display();
    }
}
