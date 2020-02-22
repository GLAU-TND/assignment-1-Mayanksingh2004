package contactDataStructure;

public class MyLinkedList<E> implements MyLinkedListADT<E> {

    private Node<E> head = null;
    private int size = 0;

    public Node<E> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void insert(E data) {
        if (head == null) {
            addFirst(data);
        } else {
            add(data, size);
        }
    }

    private void addFirst(E data) {
        head = new Node(head, data);
        size++;
    }

    private void add(E data, int index) {
        Node temp = getNode(index - 1);
        if (head == null) {
            addFirst(data);
        } else {
            Node newNode = temp.getNext();
            temp.setNext(new Node(newNode, data));
        }
        size++;

    }

    @Override
    public void delete() {
        delete(size - 1);
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            Node temp = getNode(index - 1);
            Node nextNode = getNode(index);
            temp.setNext(nextNode.getNext());
        }
        size--;
    }

    @Override
    public void traverse() {
        Node temp = head;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(temp.getData() + (i == size - 1 ? "" : ","));
            temp = temp.getNext();
        }
        System.out.println("]");

    }

    @Override
    public void sort() {

    }

    @Override
    public void swap(Node<E> first, Node<E> second, int pre) {

    }

    public Node getNode(int index) {
        Node response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }
}
