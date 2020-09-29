import java.util.Scanner;

class driver {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = PopulateList(); // Creating the list and populating it using the in-class PopulateList method, used string as it works for all inputs
        System.out.print("Printing forwards: ");
        list.printForwards(); // Printing off the list forwards
        System.out.print("\nPrinting backwards: ");
        list.printBackwards(); // Printing off the list backwards
        System.out.print("\nRemoving forwards: ");
        while(!list.isEmpty()) { // Printing the node and then deleting it from the list from the front
            System.out.print(list.getFirstValue() + " "); // Printing off the value prior to deleting it
            list.removeFirst();
        }
        System.out.println();
        list = PopulateList(); // Prompting the user to populate the list once again
        System.out.print("Removing backwards: ");
        while(!list.isEmpty()) { // Printing the node and then deleting it from the list from the back
            System.out.print(list.getLastValue() + " ");
            list.removeLast();
        }
    }

    public static DoublyLinkedList<String> PopulateList() { // Function to read in values from the user and then return the created list
        Scanner inData = new Scanner(System.in);
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        do {
            System.out.print("Enter your value: ");
            list.addLast(inData.nextLine()); // Read in their inptu and then add it to the end
            System.out.print("Would you like to continue (Enter y to continue)? ");
        } while(inData.nextLine().toUpperCase().charAt(0) == 'Y'); // If they don't enter Y (to continue), exit the loop 
        return list;
    }
}
