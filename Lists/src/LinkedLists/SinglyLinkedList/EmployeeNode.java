package LinkedLists.SinglyLinkedList;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    EmployeeNode getNext() {
        return next;
    }

    void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
