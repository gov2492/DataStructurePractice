package DoubleLinkedList;

public class Dll {

    Node head = null;
    Node tail = null;
    int size = 0;

    public Dll(int data) {
        Node n = new Node(data);
        n.setNext(null);
        n.setPrevious(null);
        head = tail = n;
    }

    public Dll() {

    }

    public void pushFront(int data) {
        if (head == null) {
            Node n = new Node(data);
            n.setNext(null);
            n.setPrevious(null);
            head = tail = n;
        }
        Node n = new Node(data);
        n.setNext(head);
        n.setPrevious(null);
        head.setPrevious(n);
        head = n;
    }

    public void pushBack(int data) {
        if (head == null) {
            Node n = new Node(data);
            n.setNext(null);
            n.setPrevious(null);
            head = tail = n;
        }
        Node n = new Node(data);
        n.setNext(null);
        n.setPrevious(tail);
        tail.setNext(n);
        tail = n;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
            size++;
        }
    }

    public void popFront() {
        if (head == null) {
            throw new IllegalArgumentException("No Node in Dll");
        }
        Node temp = head;
        head = temp.getNext();
        temp.getNext().setPrevious(null);
    }

    public void popBack() {
        if (head == null) {
            throw new IllegalArgumentException("No Node in Dll");
        }
        Node temp = tail;
        tail = temp.getPrevious();
        temp.getPrevious().setNext(null);
    }

    public void reverse() {
        Node temp = head;
        Node current;
        Node next=null;
        tail=temp;
        while (temp != null) {
            current = temp.getNext();
            temp.setNext(temp.getPrevious());
            temp.setPrevious(current);
            next=temp;
            temp=current;
        }
        head = next;
    }
}
