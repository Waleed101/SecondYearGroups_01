public interface Queue<E> { // Interface class for Queues
  public E first(); // Function to return first element
  public void enqueue(E e) throws IllegalStateException; // Function to add an element
  public E dequeue(); // Function to remove the last element
}
