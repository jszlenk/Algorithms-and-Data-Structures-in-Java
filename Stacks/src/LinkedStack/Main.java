package LinkedStack;

public class Main {
    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        Employee adam = new Employee("Adam", "X", 1);
        Employee maja = new Employee("Maja", "Y", 2);
        Employee kuba = new Employee("Kuba", "Z", 3);
        Employee olga = new Employee("Olga", "O", 4);

        stack.push(adam);
        stack.push(maja);
        stack.push(kuba);
        stack.push(olga);

        stack.printStack();
        System.out.println("-----------------------------");

        System.out.println(stack.peek());
        System.out.println("-----------------------------");

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

        System.out.println("-----------------------------");
        stack.printStack();
    }
}
