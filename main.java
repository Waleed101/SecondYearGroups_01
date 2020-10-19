class main {
    public static void main(String[] args) {
        ArrayQueue<Character> myQueue = new ArrayQueue<>(); // Initializing the queue
        for(int i = 0; i < 5; i++) // Looping through the characters
            myQueue.enqueue((char)('A' + i)); // Adding the characters to the queue using character addition
        // Removing A and B
        myQueue.dequeue();
        myQueue.dequeue();

        // Adding F and G
        myQueue.enqueue('F');
        myQueue.enqueue('G');

        // Printing off all remaining characters until the queue has one left
        while(myQueue.size() > 1)
            System.out.print(myQueue.dequeue() + ",");

        // Printing off the last character to avoid a comma at the end
        System.out.print(myQueue.dequeue());
    }
}