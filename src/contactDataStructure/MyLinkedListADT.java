package contactDataStructure;

public interface MyLinkedListADT<E> {

    void insert(E data);

    void delete();

    void traverse();

    void swap(Node<E> first, Node<E> second, int pre);

}
