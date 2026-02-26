package LinkedList;

public class deletee {
    class Node {
        Node next;
        int value;

        public Node(int data) {
            this.value = data;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    int size = 0;

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int data) {
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("end");
    }
    public Node get(int index){
        Node node = head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void deleteNode(int index){
        if(index==0){
            head=head.next;
            return;
        }
        if(index==size){
            Node second = get(size-1);
            tail=second;
            tail.next=null;
        }
        Node temp = head;


    }

    public static void main(String[] args) {
        deletee list = new deletee();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(76);
        list.insertLast(98);
        list.display();
        list.deleteNode(0);
        list.display();
    }
}
