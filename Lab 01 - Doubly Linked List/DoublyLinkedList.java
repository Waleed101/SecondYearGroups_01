public class DoublyLinkedList<E> {
    private Node<E> head, tail;
    private int size;

    public int GetSize() {return size;}
    public boolean isEmpty() {return size==0;}
    public E getFirstValue() {return head.getNext().getElement();}
    public E getLastValue() {return tail.getPrev().getElement();}
    public DoublyLinkedList() {
        head = new Node<>(null, null, null);
        tail = new Node<>(null, head, null);
        head.setNext(tail);
    }

    private class Node<E> {
        private E element;
        private Node<E> prev, next;
        public Node(E input, Node<E> p, Node<E> n)
        {
            element = input;
            prev = p;
            next = n;
        }
        public E getElement() {return element;}
        public Node<E> getPrev() {return prev;}
        public Node<E> getNext() {return next;}
        public void setPrev(Node<E> p) {prev = p;}
        public void setNext(Node<E> n) {next = n;}
    }

    public void addFirst(E valueInputted) {
        addBetween(valueInputted, head, head.getNext());
    }

    public void addLast(E valueInputted) {
        addBetween(valueInputted, tail.getPrev(), tail);
    }

    public E removeFirst() {
        if(isEmpty()) 
            return null;
        return remove(head.getNext());
    }

    public E removeLast() {
        if(isEmpty())
            return null;
        return remove(tail.getPrev());
    }
 
    private void addBetween(E valueInputted, Node<E> previous, Node<E> next) {
        Node<E> newNode = new Node<>(valueInputted, previous, next);
        previous.setNext(newNode);
        next.setPrev(newNode);
        size++;
    }

    private E remove(Node<E> nodeToRemove) {
        Node<E> previous = nodeToRemove.getPrev();
        Node<E> next = nodeToRemove.getNext();
        previous.setNext(next);
        next.setPrev(previous);
        size--;
        return nodeToRemove.getElement();
    }

    public void printForwards() {
        Node<E> currentPointer = head.getNext();
        while(currentPointer.getElement() != null) {
            System.out.print(currentPointer.getElement() + " ");
            currentPointer = currentPointer.getNext();
        }
    }

    public void printBackwards() {
        Node<E> currentPointer = tail.getPrev();
        while(currentPointer.getElement() != null) {
            System.out.print(currentPointer.getElement() + " ");
            currentPointer = currentPointer.getPrev();
        }
    }
}