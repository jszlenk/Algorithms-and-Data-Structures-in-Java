package LinkedLists.JDKLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee adam = new Employee("Adam", "X", 1);
        Employee kuba = new Employee("Kuba", "Y", 2);
        Employee anna = new Employee("Anna", "Z", 3);
        Employee maja = new Employee("Maja", "O", 4);
        Employee nina = new Employee("Nina", "N", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(adam);
        list.addFirst(kuba);
        list.addFirst(anna);
        list.addFirst(maja);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.addLast(nina);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");
    }
}
