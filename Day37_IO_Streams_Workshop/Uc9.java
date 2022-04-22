/**
 *
 * Ability to view Persons by City or State
 * - Maintain Dictionary of City and Person as well as State and Person
 * - Use Collection Library to maintain Dictionary
 *
 * 
 *
 * **/
package com.ajinkyakambe.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc9 {

    static Scanner scanner = new Scanner(System.in);

    //View specific contact person details across the AddressBook
    public static void viewContact() {

        System.out.println("Enter the Name Of Person");
        String name = scanner.next();

        System.out.println("Enter state Name");
        System.out.println("1.Delhi\n2TamilNadu\n3.Mumbai\n4.Kerala\n5.Punjab");
        int id = scanner.nextInt();
        switch (id) {
            case 1 -> View(AddressBookMainFunction.contatctsArrayList1,name);
            case 2 -> View(AddressBookMainFunction.contatctsArrayList2,name);
            case 3 -> View(AddressBookMainFunction.contatctsArrayList3,name);
            case 4 -> View(AddressBookMainFunction.contatctsArrayList4,name);
            case 5 -> View(AddressBookMainFunction.contatctsArrayList5,name);
            default -> System.out.println("SomeThing Went Wrong");
        }
    }

    public static void View(ArrayList<Contacts> contatctsArrayList, String name) {

        System.out.println("Enter mobile Number");
        long phNumber = scanner.nextInt();
        boolean b = false;

        for (Contacts i : contatctsArrayList) {
            if (i.getFirstName().equalsIgnoreCase(name)){
                if (i.getPhoneNumber() == phNumber){
                    b = true;
                    System.out.println("FirstName = "+i.getFirstName());
                    System.out.println("LastName = "+i.getLastName());
                    System.out.println("Address = "+i.getAddress());
                    System.out.println("City = "+i.getCity());
                    System.out.println("State = "+i.getState());
                    System.out.println("Zip = "+i.getZip());
                    System.out.println("PhoneNumber = "+i.getPhoneNumber());
                    System.out.println("Email = "+i.getEmail());
                }
            }
        }

        if(b) {
            System.out.println("Contact Successfully Found");
        }
        else
            System.out.println("Contact Not Found");

        if(contatctsArrayList.isEmpty())
            System.out.println("Contacts List is Empty");

    }
}
