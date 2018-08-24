package LinkedLists._Additional.IntegerLinkedList;

public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    IntegerNode(Integer value) {
        this.value = value;
    }

    Integer getValue() {
        return value;
    }

    void setValue(Integer value) {
        this.value = value;
    }

    IntegerNode getNext() {
        return next;
    }

    void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }

}
