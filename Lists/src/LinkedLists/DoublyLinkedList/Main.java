package LinkedLists.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        Employee adam = new Employee("Adam", "X", 1);
        Employee kuba = new Employee("Kuba", "Y", 2);
        Employee anna = new Employee("Anna", "Z", 3);
        Employee maja = new Employee("Maja", "O", 4);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(adam);
        list.addToFront(kuba);
        list.addToFront(anna);
        list.addToFront(maja);

        list.printList();
        System.out.println(list.getSize());

        Employee kajaEnd = new Employee("Kaja", "A", 5);
        list.addToEnd(kajaEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }
}
