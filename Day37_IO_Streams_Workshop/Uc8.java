/**
 *
 * Ability to search Person in a City or State across the multiple AddressBook
 * - Search Result can show multiple person in the city or state
 *
 * 
 *
  ***/
package com.ajinkyakambe.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc8 {

    public static void SearchContact() {

        Scanner scanner = new Scanner(System.in);

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

    public static void View(ArrayList<Contacts> contatctsArrayList,String name) {

        //Storing sameName Of the contact person Details
        ArrayList<Contacts> sameName = new ArrayList<>();
        for (Contacts i : contatctsArrayList) {
            if (name.equalsIgnoreCase(i.getFirstName())){
                sameName.add(i);
            }
        }

        if(contatctsArrayList.isEmpty())
            System.out.println("Contacts List is Empty");

        if(sameName.isEmpty())
            System.out.println("Person contact Not Present in the AddressBook");

        int count = 0;
        for (Contacts contacts: sameName) {
            count++;
        }
        if (count > 1)
            System.out.println("Multiple contacts Present With the sameName");
    }
}
