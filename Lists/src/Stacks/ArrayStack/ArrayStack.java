package Stacks.ArrayStack;

import java.util.EmptyStackException;

class ArrayStack {

    private Employee[] stack;
    private int top;

    ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    void push(Employee employee) {

        if (top == stack.length) {
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    Employee pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    Employee peek() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    private boolean isEmpty() {
        return top == 0;
    }

    void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
