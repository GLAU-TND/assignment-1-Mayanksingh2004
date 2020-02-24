package main;

import contactDataStructure.MyLinkedList;
import contactManager.ContactManager;
import personDefinition.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLinkedList<Person> personMyLinkedList = new MyLinkedList<>();
        boolean loop = false;
        while (!loop) {
            System.out.println("\nWelcome to Mayank's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choice = scanner.nextInt();
            ContactManager manager = new ContactManager();
            switch (choice) {
                case 1:
                    personMyLinkedList.insert(manager.addContact());
                    if (personMyLinkedList.getSize() > 1)
                        personMyLinkedList = personMyLinkedList.sort(personMyLinkedList);
                    break;
                case 2:
                    manager.viewContact(personMyLinkedList);
                    break;
                case 3:
                    manager.searchContact(personMyLinkedList);
                    break;
                case 4:
                    manager.deleteContact(personMyLinkedList);
                    break;
                case 5:
                    loop = true;
                    break;
                default:
                    System.out.println("Wrong Entry !!!");
            }
        }
    }
}
