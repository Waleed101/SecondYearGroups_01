public class DoublyLinkedList<E> {
    private Node<E> head, tail; // References to the head and tail
    private int size;

    public int GetSize() {return size;} // Function to get the size of the List
    public boolean isEmpty() {return size==0;} // Function to check if the List is empty (returns true if it is)
    public E getFirstValue() {return head.getNext().getElement();} // Function to get the first value from the List
    public E getLastValue() {return tail.getPrev().getElement();} // Function to get the last value from the List
    public DoublyLinkedList() { // Constructor for the list
        head = new Node<>(null, null, null); // Creating the head node
        tail = new Node<>(null, head, null); // Creating the tail node, assigning the head as the previous
        head.setNext(tail); // Assigning the tail as the next node for the head
    }

    private class Node<E> { // Inner class for nodes
        private E element;
        private Node<E> prev, next; // References to the previous and next node
        public Node(E input, Node<E> p, Node<E> n) // Constructor for the node
        {
            element = input;
            prev = p;
            next = n;
        }
        public E getElement() {return element;} // Function to get the value with the List
        public Node<E> getPrev() {return prev;} // Function to get the previous node
        public Node<E> getNext() {return next;} // Function to get the next node
        public void setPrev(Node<E> p) {prev = p;} // Function to set the previous node
        public void setNext(Node<E> n) {next = n;} // Function to get the next node
    }

    public void addFirst(E valueInputted) { // Function to add a new node right after the head
        addBetween(valueInputted, head, head.getNext());
    }

    public void addLast(E valueInputted) { // Function to add a new node right before the tail
        addBetween(valueInputted, tail.getPrev(), tail);
    }

    public E removeFirst() { // Function to remove the first node after the head
        if(isEmpty()) 
            return null;
        return remove(head.getNext());
    }

    public E removeLast() { // Function to remove the last node before the tail
        if(isEmpty())
            return null;
        return remove(tail.getPrev());
    }
 
    private void addBetween(E valueInputted, Node<E> previous, Node<E> next) { // Function to add between two passed over nodes
        Node<E> newNode = new Node<>(valueInputted, previous, next);
        previous.setNext(newNode);
        next.setPrev(newNode);
        size++;
    }

    private E remove(Node<E> nodeToRemove) { // Function to remove a specific node
        // Resetting the pointers of the previous and next node to each other
        Node<E> previous = nodeToRemove.getPrev();
        Node<E> next = nodeToRemove.getNext();
        previous.setNext(next);
        next.setPrev(previous);
        size--; // Reducing the size
        return nodeToRemove.getElement(); // Return the value to signal that something actually happened
    }

    public void printForwards() { // Function to print the list forwards
        Node<E> currentPointer = head.getNext(); // Start at the head
        while(currentPointer.getElement() != null) { // Keep going until it reaches the tail
            System.out.print(currentPointer.getElement() + " "); // Print off the element value
            currentPointer = currentPointer.getNext(); // Go the next node
        }
    }

    public void printBackwards() { // Function to print the list backwards, same as the previous - just uses previous
        Node<E> currentPointer = tail.getPrev();
        while(currentPointer.getElement() != null) {
            System.out.print(currentPointer.getElement() + " ");
            currentPointer = currentPointer.getPrev();
        }
    }
}
