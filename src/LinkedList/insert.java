package LinkedList;

public class insert {
    class Node {
        Node next;
        int value;
        public Node(int data){
            this.value=data;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
        Node head;
        Node tail;
        int size=0;
        public void insertFirst(int data){
            Node node = new Node(data);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size++;
        }
        public void insertLast(int data){
            Node node = new Node(data);
            tail.next=node;
            tail=node;
            size++;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.print("end");
        }

        public void insertIndex(int data,int index) {
            if(index==0){
                insertFirst( data);
                return;
            }
            if(index==size){
                insertLast(data);
                return;
            }
            Node temp=head;
            for (int i = 1; i < index; i++) {


                temp = temp.next;
            }
            Node node = new Node( data,temp.next);
            temp.next=node;
        }

        public static void main(String[]args){
            insert list = new insert();
            list.insertFirst(5);
            list.insertFirst(6);
            list.insertFirst(7);
            list.insertFirst(8);
            list.insertFirst(9);
            list.insertLast(76);
            list.insertLast(98);
            list.display();
            list.insertIndex(45,3);
            list.display();
        }
    }

