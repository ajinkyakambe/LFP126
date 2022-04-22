/**
 *
 * Ability to sort the entries in the address book by City, State, or Zip
 * - Write functions to sort person by City, State or Zip
 * Use Collection Library for sorting
 *
 * 
 *
 * **/
package com.ajinkyakambe.Addressbook;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Uc12 {
    public static void sortByUserWish(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Which Type you want to sort the AddressBook");
        System.out.println("\n1 . Sort by City\n2 . Sort by State\n3 . Sort by Zip");
        int userWish = scanner.nextInt();

        switch (userWish){

            case 1:
                // Sort People by their City
                Collections.sort(AddressBookMainFunction.contatctsArrayList1, Comparator.comparing(Contacts::getCity));
                Collections.sort(AddressBookMainFunction.contatctsArrayList2, Comparator.comparing(Contacts::getCity));
                Collections.sort(AddressBookMainFunction.contatctsArrayList3, Comparator.comparing(Contacts::getCity));
                Collections.sort(AddressBookMainFunction.contatctsArrayList4, Comparator.comparing(Contacts::getCity));
                Collections.sort(AddressBookMainFunction.contatctsArrayList5, Comparator.comparing(Contacts::getCity));
                break;

            case 2:
                // Sort People by their State
                Collections.sort(AddressBookMainFunction.contatctsArrayList1, Comparator.comparing(Contacts::getState));
                Collections.sort(AddressBookMainFunction.contatctsArrayList2, Comparator.comparing(Contacts::getState));
                Collections.sort(AddressBookMainFunction.contatctsArrayList3, Comparator.comparing(Contacts::getState));
                Collections.sort(AddressBookMainFunction.contatctsArrayList4, Comparator.comparing(Contacts::getState));
                Collections.sort(AddressBookMainFunction.contatctsArrayList5, Comparator.comparing(Contacts::getState));
                break;

            case 3:
                // Sort People by their Zip
                Collections.sort(AddressBookMainFunction.contatctsArrayList1, Comparator.comparing(Contacts::getZip));
                Collections.sort(AddressBookMainFunction.contatctsArrayList2, Comparator.comparing(Contacts::getZip));
                Collections.sort(AddressBookMainFunction.contatctsArrayList3, Comparator.comparing(Contacts::getZip));
                Collections.sort(AddressBookMainFunction.contatctsArrayList4, Comparator.comparing(Contacts::getZip));
                Collections.sort(AddressBookMainFunction.contatctsArrayList5, Comparator.comparing(Contacts::getZip));
                break;

            default:
                System.out.println("SomeThing Went Wrong");
        }
    }
}
