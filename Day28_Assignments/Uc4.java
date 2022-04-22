/**
 *
 * Ability to delete a person using person's name
 * Use Console to delete a person
 *
 * 
 *
 * **/
package com.ajinkyakambe.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc4 {

    static Scanner sc4 = new Scanner(System.in);

    public static void removePart() {

        System.out.println("Enter Name Of Which Person Contact You Delete :");
        String delete = sc4.next();

        System.out.println("Enter state of the Person :");
        System.out.println("1.Delhi\n2.TamilNadu\n3.Mumbai\n4.Kerala\n5.Punjab");
        int stateid = sc4.nextInt();
        switch (stateid) {
            case 1 -> removeContacts(delete,AddressBookMainFunction.contatctsArrayList1);
            case 2 -> removeContacts(delete,AddressBookMainFunction.contatctsArrayList2);
            case 3 -> removeContacts(delete,AddressBookMainFunction.contatctsArrayList3);
            case 4 -> removeContacts(delete,AddressBookMainFunction.contatctsArrayList4);
            case 5 -> removeContacts(delete,AddressBookMainFunction.contatctsArrayList5);
            default -> System.out.println("SomeThing Went Wrong");
        }
    }

    // Remove contacts Based on User wish
    public static void removeContacts(String delete, ArrayList<Contacts> contatctsArrayList) {

        Scanner sc = new Scanner(System.in);
        boolean b = false;

        try {
            for (Contacts i : contatctsArrayList) {
                b = i.getFirstName().contains(delete);
                if (i.getFirstName().equals(delete)) {
                    contatctsArrayList.remove(i);
                }
            }
        }
        catch (Exception e){
            System.out.println();
        }
        if(b) {
            System.out.println("Contact Successfully Deleted");
        }
        else
            System.out.println("Contact Not Found");
    }

}
