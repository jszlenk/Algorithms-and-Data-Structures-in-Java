package LinkedLists.DoublyLinkedList;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    EmployeeNode getNext() {
        return next;
    }

    void setNext(EmployeeNode next) {
        this.next = next;
    }

    EmployeeNode getPrevious() {
        return previous;
    }

    void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public String toString() {
        return employee.toString();
    }

}
