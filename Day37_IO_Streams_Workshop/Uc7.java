/**
 *
 * Ability to ensure there is no Duplicate Entry of the same Person in a particular Address Book
 * - Duplicate Check is done on Person Name while adding person to Address Book.
 * - Use Collection Methods to Search Person by Name for Duplicate Entry
 * - Override equals method to check for Duplicate
 *
 * 
 *
  **/
package com.ajinkyakambe.Addressbook;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Uc7 {

    // To check adding new contact is already exist in addressBook
    public static boolean check(Contacts contacts, ArrayList<Contacts> contatctsArrayList) {

        boolean Exists = Stream.of(contacts).anyMatch(e -> contatctsArrayList.contains(e));
        return Exists;
    }
}
