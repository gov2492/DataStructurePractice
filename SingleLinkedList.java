package SingleLinkedList;

public class SingleLinkedList {

    Node head = null;
    Node tail = null;
    private int size = 0;

    public void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = null;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(n);
        n.setNext(null);
        tail = n;

    }

    public void insertAtStart(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;

        }
        Node temp = head;
        n.setNext(temp);
        head = n;

    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
            size++;
        }
    }

    public void insertAtPosition(int position, int data) {
        if (position <= 0 || position > getSize()) {
            throw new IllegalArgumentException("Position is invalid");
        } else if (position == 1) {
            Node n = new Node(10);
            if (head == null) {
                head = n;

            } else {
                Node temp = head;
                n.setNext(temp);
                head = n;
            }
        } else {
            Node n = new Node(data);
            Node temp = head;
            Node currentNode = null;
            position--;
            while (position != 0) {
                currentNode = temp;
                temp = temp.getNext();
                position--;
            }
            n.setNext(temp);
            currentNode.setNext(n);
        }
    }
    public void reverse()
    {
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void popFront()
    {
        if(head==null){
            throw new IllegalArgumentException("No nodes found");
        }
        head=head.getNext();
    }
    public void popBack()
    {
        Node n=head;
        while(n.getNext().getNext()!=null)
        {
            n=n.getNext();
        }
        n.setNext(null);
    }
}
