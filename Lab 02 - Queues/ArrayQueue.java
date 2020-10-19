public class ArrayQueue<E> implements Queue<E> {
    private final int CAPACITY = 10; // Default capacity if none is specified
    private E[] data; // Holds all the data
    private int f = 0; // 
    private int sz = 0; // Size of the queue

    public ArrayQueue(int capacity){ // Constructor if capacity is specified
        data = (E[]) new Object[capacity];
    }

    public ArrayQueue() { // No capacity constructor
        data = (E[]) new Object[CAPACITY];
    }

    public int size() {return sz;} // Get the size of the queue
    public boolean isEmpty() {return (sz == 0);} // Return true if the queue is empty

    public void enqueue(E e) throws IllegalStateException { // Function to add a value
        if(sz == data.length) throw new IllegalStateException("Queue is full"); // If queue is full, throw exception
        int slot = (f + sz); // Get current slot
        data[slot] = e; // Add data to that slot 
        sz++; // Increase size
    }

    public E first() { // Function to get the front value of the queue
        if(isEmpty()) return null;
        return data[f];
    }
    
    public E dequeue() { // Function to remove the front character (queues are FIFO)
        if(isEmpty()) return null; // If its empty, then can't remove anything
        E answer = data[f]; // Storing the value temporarily to return it after deletion 
        data[f] = null; // Deleting the value
        f = (f+1) % data.length; 
        sz--; // Reducing the size
        return answer;
    }
}
