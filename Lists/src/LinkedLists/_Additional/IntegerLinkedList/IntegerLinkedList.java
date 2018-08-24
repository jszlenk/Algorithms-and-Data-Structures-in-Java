package LinkedLists._Additional.IntegerLinkedList;

class IntegerLinkedList {

    private IntegerNode head;

    private void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
    }

    void removeFromFront() {
        if (isEmpty()) {
            return;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
    }

    void insertSorted(Integer value) {

        if (head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }

        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while (current != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);
    }

    private boolean isEmpty() {
        return head == null;
    }

    void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
