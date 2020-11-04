class Node <T> { 
    T data; 
    Node<T> next; 
    public void displayNodeData() {
        System.out.print(data + " => ");
    }
} 

public class LinkedList <T> {
    private Node<T> head;

    public void addFirst(T data) {
        Node n = new Node();
        n.data = data;  // Set the new node with the given data
        n.next = head;  // Set the new node to point at the head
        head = n;       // Set the new node as the head
    }

    public void addLast(T data) {
        Node n = head;
        
        // Get to the last node
        while (n.next != null) {
            n = n.next;
        }

        Node newN = new Node();
        newN.data = data; // Make new node and input the data
        n.next = newN; // Set the point to the new node
    }

    public void add(T data, int index) {
        Node n = head;

        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n.next = n.next;
        Node newN = new Node();
        newN.data = data;
        newN.next = n.next;
    }

    public boolean contains(T t) {
        Node n = head;
        while (n.next != null) {
            if (t == n.data) {
                return true;
            }
        }
        return false;
    }
}