package contactDataStructure;

import personDefinition.Person;

public class MyLinkedList<E> implements MyLinkedListADT<E> {

    private Node<E> head = null;
    private int size = 0;

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
            temp.next = new Node(newNode, data);
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
            temp.next = nextNode.getNext();
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

    private void swap(Node<E> first, Node<E> second, int pre) {
        if (first == head) {
            Node temp = second.getNext();
            head = second;
            second.next = first;
            first.next = temp;
        } else {
            Node temp = second.getNext();
            Node previous = getNode(pre);
            previous.next = second;
            second.next = first;
            first.next = temp;
        }
    }

    @Override
    public MyLinkedList<E> sort(MyLinkedList<E> person) {
        for (int i = 0; i < person.getSize(); i++) {
            for (int j = 1; j < person.getSize(); j++) {
                Node person1 = person.getNode(j - 1);
                Node person2 = person.getNode(j);
                Person first = (Person) person1.getData();
                Person second = (Person) person2.getData();
                if (first.getFirstName().compareToIgnoreCase(second.getFirstName()) >= 1) {
                    person.swap(person1, person2, j - 2);
                }
            }
        }
        return person;
    }

    private Node getNode(int index) {
        Node response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    public E dataAtIndex(int index) {
        Node<E> temp = getNode(index);
        return temp.getData();
    }

    private class Node<E> {
        private E data;
        private Node<E> next;

        public Node(Node<E> next, E data) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

    }

}

