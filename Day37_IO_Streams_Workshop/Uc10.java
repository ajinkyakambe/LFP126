/**
 *
 * Ability to get number of contact persons
 * i.e.count by City or State
 * - Search Result will show count by city and by state
 *
 * 
 *
  **/
package com.ajinkyakambe.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc10 {

    // Get totalNumber of contact present in the specific AddressBook
    public static void GetTotalcount() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter state Name");
        System.out.println("1.Delhi\n2TamilNadu\n3.Mumbai\n4.Kerala\n5.Punjab");
        int id = scanner.nextInt();
        switch (id) {
            case 1 -> View(AddressBookMainFunction.contatctsArrayList1);
            case 2 -> View(AddressBookMainFunction.contatctsArrayList2);
            case 3 -> View(AddressBookMainFunction.contatctsArrayList3);
            case 4 -> View(AddressBookMainFunction.contatctsArrayList4);
            case 5 -> View(AddressBookMainFunction.contatctsArrayList5);
            default -> System.out.println("SomeThing Went Wrong");
        }
    }

    public static void View(ArrayList<Contacts> contatctsArrayList) {

        long total = contatctsArrayList.stream().count();

        System.out.println("Totally "+total+ "contacts present in the AddressBook");

        if(contatctsArrayList.isEmpty())
            System.out.println("Contacts List is Empty");

    }
}
