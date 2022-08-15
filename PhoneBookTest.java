//Peter Hovenier, Neko Wolf
// July 15, 2022
// Assignment: Phone Book
// CS145 Professor Darrell Criss

import java.util.*;

public class PhoneBookTest {
   // This program asks for input as a menu, and can add, list, edit, or delete an entry in the phonebook
   public static void main(String[] args) {
      PhoneBookManager myManager = new PhoneBookManager();
      System.out.println("Welcome to the Phone Book");
      System.out.println("Type a command or 'exit' to quit:");
      myManager.listCommands();
      System.out.print("> ");
      Scanner input = new Scanner(System.in);
      String command = input.nextLine();
      while (!command.equals("exit")) {
         switch (command) {
            case "list":
               myManager.printPhoneBook();
               break;
            case "add":
               addContact(myManager, input);
               break;
            case "edit":
               editContact(myManager, input);
               break;
            case "delete":
               deleteContact(myManager, input);
               break;
            default:
               System.out.println("Invalid command");
               break;
         }
         myManager.listCommands();
         System.out.print("> ");
         command = input.nextLine();
      }
   }
   //This method adds a contact into the phonebook
   public static void addContact(PhoneBookManager myManager, Scanner input) {
      System.out.println("Please enter the last name of the contact: ");
      String name = input.nextLine();
      System.out.println("Please enter the address of the contact: ");
      String address = input.nextLine();
      System.out.println("Please enter the city of the contact: ");
      String city = input.nextLine();
      System.out.println("Please enter the phone number of the contact: ");
      String number = input.nextLine();
      ListNode ln = new ListNode();
      ln.setLastName(name);
      ln.setAddress(address);
      ln.setCity(city);
      ln.setPhoneNumber(number);
      myManager.addContact(ln);
    }  
    //This method deletes a contact from the phonebook
   public static void deleteContact(PhoneBookManager myManager, Scanner input) {
      System.out.println("Please enter the last name of the contact to delete: ");
      String name = input.nextLine();
      ListNode ln = new ListNode();
      myManager.deleteContact(name);
    }  
    //This method will ask which contact you want to edit, then replace it with the provided information
   public static void editContact(PhoneBookManager myManager, Scanner input) {
      System.out.println("Please enter the last name of the contact to be edited: ");
      String name = input.nextLine();
      System.out.println("Please enter the address of the contact: ");
      String address = input.nextLine();
      System.out.println("Please enter the city of the contact: ");
      String city = input.nextLine();
      System.out.println("Please enter the phone number of the contact: ");
      String phoneNumber = input.nextLine();
      myManager.editContactCity(name, city);
      myManager.editContactName(name);
      myManager.editContactAddress(name, address);
      myManager.editContactPhoneNumber(name, phoneNumber);
    }  


}    
               