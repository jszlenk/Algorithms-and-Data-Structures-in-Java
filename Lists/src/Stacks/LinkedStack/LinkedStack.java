package Stacks.LinkedStack;

import java.util.LinkedList;
import java.util.ListIterator;

class LinkedStack {

    private LinkedList<Employee> stack;

    LinkedStack() {
        stack = new LinkedList<>();
    }

    void push(Employee employee) {
        stack.push(employee);
    }

    Employee pop() {
        return stack.pop();
    }

    Employee peek() {
        return stack.peek();
    }

    void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
