/**
 *
 * Ability to Add multiple person contacts
 * Use Console to add a person details
 *
 *
 *
 * **/
package com.ajinkyakambe.Addressbook;

import java.util.Scanner;

public class Uc5 {

     // Use addContacts method and get input from user
    public static ArrayList<Contacts> addContacts() {

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
        System.out.println("1.Delhi\n2.TamilNadu\n3.Mumbai\n4.Kerala\n5.Punjab");
        int stateid = sc.nextInt();
        switch (stateid) {
            case 1 -> {
                String state = "Delhi";
                contacts.setState(state);
            }
            case 2 -> {
                String state = "TamilNadu";
                contacts.setState(state);
            }
            case 3 -> {
                String state = "Mumbai";
                contacts.setState(state);
            }
            case 4 -> {
                String state = "Kerala";
                contacts.setState(state);
            }
            case 5 -> {
                String state = "Punjab";
                contacts.setState(state);
            }
            default -> System.out.println("SomeThing Went Wrong");
        }

        System.out.println("Enter The Zip Number :");
        int zip = sc.nextInt();
        contacts.setZip(zip);

        System.out.println("Enter Phone Number :");
        long phoneNumber = sc.nextLong();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter The Email :");
        String email = sc.next();
        contacts.setEmail(email);

        Uc6.addNewContacts(stateid,contacts);
        return AddressBookMainFunction.contatctsArrayList1;
    }
}
