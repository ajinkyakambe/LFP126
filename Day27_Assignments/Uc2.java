/**
 *
 * Ability to add a new Contact to Address Book
 * Use Console to add person details and Store it.
 *
 * 
 *
 **/
package com.ajinkyakambe.Addressbook;

import java.util.Scanner;

public class Uc2 {

    // Use addContacts method and get input from user
    public static void addContacts() {

        Scanner sc = new Scanner(System.in);
        Contacts contacts = new Contacts();

        System.out.println("Enter First Name :");
        String firstName = sc.next();
        contacts.setFirstName(firstName);

        System.out.println("Enter Last Name :");
        String lastName = sc.next();
        contacts.setLastName(lastName);

        System.out.println("Enter The Address :");
        String address = sc.next();
        contacts.setAddress(address);

        System.out.println("Enter The City :");
        String city = sc.next();
        contacts.setCity(city);

        System.out.println("Enter The State :");
        String state = sc.next();
        contacts.setState(state);

        System.out.println("Enter The Zip Number :");
        int zip = sc.nextInt();
        contacts.setZip(zip);

        System.out.println("Enter Phone Number :");
        long phoneNumber = sc.nextLong();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter The Email :");
        String email = sc.next();
        contacts.setEmail(email);

        AddressBookMainFunction.contatctsArrayList1.add(contacts); // adding contacts to the AddressBook
    }
}
