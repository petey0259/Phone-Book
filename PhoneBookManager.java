//Peter Hovenier, Neko Wolf
// July 15, 2022
//CS145 Assignment: phone book
//Darrell Criss

import java.util.*;
//The manager class for the phone book
public class PhoneBookManager {
   private LinkedList<ListNode> contacts = new LinkedList<ListNode>();
   //Adds a contact
   public void addContact(ListNode node) {
      contacts.add(node);
   }
   // Lists the contacts
   public void printPhoneBook() { 
      for (int i = 0; i < contacts.size(); i++) {
         ListNode ln = contacts.get(i);
         ln.printNode();
      }
   }
   //List commands for the interactive menu
    public void listCommands() {
      System.out.println("'list' to list contacts");
      System.out.println("'add' to add a contact");
      System.out.println("'edit' to edit a contact");
      System.out.println("'delete' to delete a contact");
   }
   // Delete a contact from the phone book
   public void deleteContact(String name) { 
      for (int i = 0; i < contacts.size(); i++) {
         ListNode ln = contacts.get(i);
         if (ln.getLastName().equals(name)) {
            contacts.remove(i);
         }
      }
   }
   // Edit the city of the contact
   public void editContactCity(String name, String city) {
      for (int i = 0; i < contacts.size(); i++) {
         ListNode ln = contacts.get(i);
         if (ln.getLastName().equals(name)) {
            ln.setCity(city);
         }
      }
   }
   //edit the name of the contact
   public void editContactName(String name) {
      for (int i = 0; i < contacts.size(); i++) {
         ListNode ln = contacts.get(i);
         if (ln.getLastName().equals(name)) {
            ln.setLastName(name);
         }
      }
   }
   //edit the address of the contact
   public void editContactAddress(String name, String address) {
      for (int i = 0; i < contacts.size(); i++) {
         ListNode ln = contacts.get(i);
         if (ln.getLastName().equals(name)) {
            ln.setAddress(address);
         }
      }
   }   
   //edit the phone number of the contact
   public void editContactPhoneNumber(String name, String phoneNumber) {
      for (int i = 0; i < contacts.size(); i++) {
         ListNode ln = contacts.get(i);
         if (ln.getLastName().equals(name)) {
            ln.setPhoneNumber(phoneNumber);
         }
      }
   }   
   
   
   
   
   
   
   
   
   
   
   
   
}
