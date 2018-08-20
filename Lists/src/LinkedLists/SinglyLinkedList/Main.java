package LinkedLists.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        Employee adam = new Employee("Adam", "X", 1);
        Employee kuba = new Employee("Kuba", "Y", 2);
        Employee anna = new Employee("Anna", "Z", 3);
        Employee maja = new Employee("Maja", "O", 4);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(adam);
        list.addToFront(kuba);
        list.addToFront(anna);
        list.addToFront(maja);

        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());
        list.printList();
    }
}
