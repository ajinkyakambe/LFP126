/**
 *
 * Ability to edit existing contact person using their name
 * Using Console to Edit person details
 *
 * 
 *
 * **/
package com.ajinkyakambe.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc3 {

    static Scanner sc1 = new Scanner(System.in);

    public static void editPart(){
        System.out.println("Enter Name Of The Contact For Editing :");
        String editPerson = sc1.next();
        System.out.println("Enter The state :");
        System.out.println("1.Delhi\n2.TamilNadu\n3.Mumbai\n4.Kerala\n5.Punjab");
        int stateid = sc1.nextInt();
        switch (stateid) {
            case 1 -> editContacts(editPerson,AddressBookMainFunction.contatctsArrayList1);
            case 2 -> editContacts(editPerson,AddressBookMainFunction.contatctsArrayList2);
            case 3 -> editContacts(editPerson,AddressBookMainFunction.contatctsArrayList3);
            case 4 -> editContacts(editPerson,AddressBookMainFunction.contatctsArrayList4);
            case 5 -> editContacts(editPerson,AddressBookMainFunction.contatctsArrayList5);
            default -> System.out.println("SomeThing Went Wrong");
        }
    }

    // Edit contacts Based on User wish
    public static void editContacts(String editPerson, ArrayList<Contacts> contatctsArrayList) {

        for (Contacts i : contatctsArrayList){
            if(editPerson.equals(i.getFirstName())){
                System.out.println("Enter Which Part To You Want To Edit :");  // Edit Inside data of Contacts
                System.out.println("1.firstName\n2.lastName\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone\n8 .Email");
                int edit = sc1.nextInt();
                switch (edit) {
                    case 1 -> {
                        System.out.println("Enter New first name :");
                        String firstName = sc1.next();
                        i.setFirstName(firstName);
                    }
                    case 2 -> {
                        System.out.println("Enter New Last name :");
                        String lastName = sc1.next();
                        i.setLastName(lastName);
                    }
                    case 3 -> {
                        System.out.println("Enter New Address :");
                        String address = sc1.next();
                        i.setAddress(address);
                    }
                    case 4 -> {
                        System.out.println("Enter New city Name :");
                        String city = sc1.next();
                        i.setCity(city);
                    }
                    case 5 -> {
                        System.out.println("Enter new State name :");
                        String state = sc1.next();
                        i.setState(state);
                    }
                    case 6 ->{
                        System.out.println("Enter new Zip number :");
                        int zip = sc1.nextInt();
                        i.setZip(zip);
                    }
                    case 7 -> {
                        System.out.println("Enter new Phone Number :");
                        long phoneNumber = sc1.nextLong();
                        i.setPhoneNumber(phoneNumber);
                    }
                    case 8 -> {
                        System.out.println("Enter new Email :");
                        String email = sc1.next();
                        i.setEmail(email);
                    }
                    default -> System.out.println("Something went wrong");
                }
            }
        }
    }
}
