import java.util.Scanner;

class driver {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = PopulateList();
        System.out.print("Printing forwards: ");
        list.printForwards();
        System.out.print("\nPrinting backwards: ");
        list.printBackwards();
        System.out.print("\nRemoving forwards: ");
        while(!list.isEmpty()) {
            System.out.print(list.getFirstValue() + " ");
            list.removeFirst();
        }
        System.out.println();
        list = PopulateList();
        System.out.print("Removing backwards: ");
        while(!list.isEmpty()) {
            System.out.print(list.getLastValue() + " ");
            list.removeLast();
        }
    }

    public static DoublyLinkedList<String> PopulateList() {
        Scanner inData = new Scanner(System.in);
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        do {
            System.out.print("Enter your value: ");
            list.addLast(inData.nextLine());
            System.out.print("Would you like to continue (Enter y to continue)? ");
        } while(inData.nextLine().toUpperCase().charAt(0) == 'Y');
        return list;
    }
}