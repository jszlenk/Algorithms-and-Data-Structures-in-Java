package LinkedLists._Additional.addBefore;

public class Main {
    public static void main(String[] args) {

        Employee adam = new Employee("Adam", "X", 1);
        Employee kuba = new Employee("Kuba", "Y", 2);
        Employee anna = new Employee("Anna", "Z", 3);
        Employee maja = new Employee("Maja", "O", 4);
        Employee nina = new Employee("Nina", "A", 5);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(adam);
        list.addToFront(kuba);
        list.addToFront(anna);
        list.addToFront(maja);
        list.printList();

        list.addBefore(nina, maja);
        list.printList();

        list.addBefore(new Employee("Olga", "B", 6), kuba);
        list.printList();
        list.getSize();
    }
}
