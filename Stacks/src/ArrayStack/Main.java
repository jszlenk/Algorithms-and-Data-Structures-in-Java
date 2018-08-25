package ArrayStack;

public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Adam", "X", 1));
        stack.push(new Employee("Kuba", "Y", 2));
        stack.push(new Employee("Anna", "Z", 3));
        stack.push(new Employee("Maja", "O", 4));

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