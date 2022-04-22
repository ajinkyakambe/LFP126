/**
 *
 * Ability to sort the entries in the address book alphabetically by Person’s name
 * - Use Console to sort person details by name
 * - Use Collection Library for Sorting
 * Override toString method to finally Print Person Entry in Concole
 *
 * 
 *
 ***/
package com.ajinkyakambe.Addressbook;

import java.util.Collections;
import java.util.Comparator;

public class Uc11 {

    public static void sort(){

    // Sort People by their Name
       Collections.sort(AddressBookMainFunction.contatctsArrayList1, Comparator.comparing(Contacts::getFirstName));
       Collections.sort(AddressBookMainFunction.contatctsArrayList2, Comparator.comparing(Contacts::getFirstName));
       Collections.sort(AddressBookMainFunction.contatctsArrayList3, Comparator.comparing(Contacts::getFirstName));
       Collections.sort(AddressBookMainFunction.contatctsArrayList4, Comparator.comparing(Contacts::getFirstName));
       Collections.sort(AddressBookMainFunction.contatctsArrayList5, Comparator.comparing(Contacts::getFirstName));

    }
}
