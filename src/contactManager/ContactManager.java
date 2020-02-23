package contactManager;

import contactDataStructure.MyLinkedList;
import inputManager.Input;
import personDefinition.Person;

import java.util.Scanner;

public class ContactManager {
    Scanner scanner = new Scanner(System.in);
    MyLinkedList<Long> contactNumberList = null;
    Input input = new Input();
    Person contact = null;

    public Person addContact() {
        System.out.print("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name : ");
        String lastName = scanner.nextLine();
        // contactNumberList
        contactNumberList = new MyLinkedList();
        char choice = 'y';
        long contactNumber;
        while (choice == 'y') {
            System.out.print("Contact Number :");
            contactNumber = Long.parseLong(scanner.nextLine());
            if (input.contactNumber(contactNumber)) {
                contactNumberList.insert(contactNumber);
            } else {
                System.out.println("Invalid Contact Number");
                continue;
            }

            System.out.print("Would you like to add another contact number? (y/n): ");
            choice = (scanner.nextLine()).charAt(0);
        }
        System.out.print("Email Address: ");
        String emailAddress = scanner.nextLine();
        while (true) {
            if (input.emailAddress(emailAddress)) {
                contact = new Person(firstName, lastName, contactNumberList, emailAddress);
                break;
            } else {
                System.out.println("Invalid Email address");
                System.out.print("Email Address: ");
                emailAddress = scanner.nextLine();
            }
        }
        return contact;
    }
}
