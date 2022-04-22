/**
 *
 * Refactor all the code and ability to create multiple addressBook
 * Add contacts to the addressBook
 *
 *
 *
  **/
package com.ajinkyakambe.Addressbook;

public class Uc6 {

    public static void addNewContacts(int stateid, Contacts contacts) {

        switch (stateid) {
            case 1 -> {
                boolean value = Uc7.check(contacts,AddressBookMainFunction.contatctsArrayList1);
                if(!value) {
                    AddressBookMainFunction.contatctsArrayList1.add(contacts);
                    AddressBookMainFunction.TotalAddressBook.put(" DELHI PEOPLE ADDRESS BOOK", AddressBookMainFunction
                            .contatctsArrayList1);
                }
                else
                    System.out.println("Yes...already contact exceeded");
            }
            case 2 -> {
                boolean value = Uc7.check(contacts,AddressBookMainFunction.contatctsArrayList2);
                if(!value) {
                    AddressBookMainFunction.contatctsArrayList2.add(contacts);
                    AddressBookMainFunction.TotalAddressBook.put(" TAMILNADU PEOPLE ADDRESS BOOK", AddressBookMainFunction
                            .contatctsArrayList2);
                }
                else
                    System.out.println("Yes...already contact exceeded");
            }
            case 3 -> {
                boolean value = Uc7.check(contacts,AddressBookMainFunction.contatctsArrayList3);
                if(!value) {
                    AddressBookMainFunction.contatctsArrayList3.add(contacts);
                    AddressBookMainFunction.TotalAddressBook.put(" MUMBAI PEOPLE ADDRESS BOOK", AddressBookMainFunction
                            .contatctsArrayList3);
                }
                else
                    System.out.println("Yes...already contact exceeded");
            }
            case 4 -> {
                boolean value = Uc7.check(contacts,AddressBookMainFunction.contatctsArrayList4);
                if(!value) {
                    AddressBookMainFunction.contatctsArrayList3.add(contacts);
                    AddressBookMainFunction.TotalAddressBook.put(" KERALA PEOPLE ADDRESS BOOK", AddressBookMainFunction
                            .contatctsArrayList4);
                }
                else
                    System.out.println("Yes...already contact exceeded");
            }
            case 5 -> {
                boolean value = Uc7.check(contacts,AddressBookMainFunction.contatctsArrayList5);
                if(!value) {
                    AddressBookMainFunction.contatctsArrayList3.add(contacts);
                    AddressBookMainFunction.TotalAddressBook.put(" PUNJAB PEOPLE ADDRESS BOOK", AddressBookMainFunction
                            .contatctsArrayList5);
                }
                else
                    System.out.println("Yes...already contact exceeded");
            }
            default -> System.out.println("Some thing went Wrong");
        }
    }
}
