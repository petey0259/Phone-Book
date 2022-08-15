//Peter Hovenier, Neko Wolf
//July 15, 2022
//CS 145 Darrell Criss
//Assignment: phone book

import java.util.*;
//initializes the string values for the entry
public class ListNode {
   private String lastName;
   private String address;
   private String city;
   private String phoneNumber;
   //get mehod for last name
   public String getLastName() {
      return this.lastName;
   }
   //get method for address
   public String getAddress() {
      return this.address;
   }
   //get method for city
   public String getCity() {
      return this.city;
   }
   //get method for phone number
   public String getPhoneNumber() {
      return this.phoneNumber;
   }
   //set method for name
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   //set method for address
   public void setAddress(String address) {
      this.address = address;
   }
   //set method for city
   public void setCity(String city) {
      this.city = city;
   }
   //set method for phone number
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   //prints out each entry in the phonebook
   public void printNode() { 
      System.out.println("last name = " + lastName + ",  address = " + address + ", city = " + city + ", phone number = " + phoneNumber);
   }
   
   
   
   
   

}