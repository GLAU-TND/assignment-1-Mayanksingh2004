package contactDataStructure;

public interface MyLinkedListADT<E> {

    void insert(E data);

    void delete();

    void traverse();

    MyLinkedList<E> sort(MyLinkedList<E> person);

}
