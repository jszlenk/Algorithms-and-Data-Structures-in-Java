package Insert;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(76);
        heap.insert(81);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(93);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();
    }
}
