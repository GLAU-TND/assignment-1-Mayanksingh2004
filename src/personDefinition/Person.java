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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MyLinkedList<Long> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(MyLinkedList<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
