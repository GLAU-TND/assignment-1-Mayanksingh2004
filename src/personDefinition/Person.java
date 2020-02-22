package personDefinition;

import contactDataStructure.MyLinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private MyLinkedList<Long> contactNumber;
    private String emailAddress;

    public Person(String firstName, String lastName, MyLinkedList<Long> contactNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }
}
