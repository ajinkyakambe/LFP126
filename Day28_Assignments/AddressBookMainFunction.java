/**
 *
 * Ability to create a Contacts in AddressBook
 * Add first and last names, address, city, state, zip, phone number and email
 * Ability to Add new contacts , Edit existing contacts , Delete contacts
 * Ability to Read or Write the Address Book with Persons Contact into a File using File IO
 * Ability to Read/Write the Address Book with Persons Contact as CSV File - Use OpenCSV Library
 * Ability to Read or Write the Address Book with Persons Contact as JSON File UC 15 - Use GSON Library
 *
 
 *
 **/
package com.ajinkyakambe.Addressbook;

import com.ajinkyakambe.Addressbook.CSVFileIO.ReadWriteCSVFile;
import com.ajinkyakambe.Addressbook.FileIO.ReadWriteOperations;
import com.ajinkyakambe.Addressbook.JSONFileIO.ReadWriteJSONFile;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMainFunction {

    public static ArrayList<Contacts> contatctsArrayList1 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList2 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList3 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList4 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList5 = new ArrayList<>();
    public static ArrayList<Contacts> contatctsArrayList = new ArrayList<>();

    public static  ReadWriteOperations readWriteObj = new ReadWriteOperations();
    public static ReadWriteCSVFile csvObj = new ReadWriteCSVFile();
    public static ReadWriteJSONFile jsonObj = new ReadWriteJSONFile();

    public static HashMap<String,ArrayList<Contacts>> TotalAddressBook = new HashMap<>();

    static void mainMenu() throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n================================== ADDRESS BOOK =========================================");
        System.out.println("1 . Add a New Contact");
        System.out.println("2 . Edit a exist Contact");
        System.out.println("3 . Delete a Contact");
        System.out.println("4 . View Contact list");
        System.out.println("5 . View All Address Book Names");
        System.out.println("6 . Search a Person");
        System.out.println("7 . View exact person Details");
        System.out.println("8 . Get Total Number of contact Present in Specific AddressBook");
        System.out.println("9 . Sort the AddressBook by userWish");
        System.out.println("10 . Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                contatctsArrayList = Uc5.addContacts();
                readWriteObj.writeInAddressBook(contatctsArrayList);
                csvObj.writeCSVFile(contatctsArrayList);
                jsonObj.writeJSONFile(contatctsArrayList);
                mainMenu();
            }
            case 2 -> {
                Uc3.editPart();
                mainMenu();
            }
            case 3 -> {
                Uc4.removePart();
                mainMenu();
            }
            case 4 -> {
                readWriteObj.readFromAddressBook();
                csvObj.readCSVFile();
                jsonObj.readJSONFile();
                mainMenu();
            }
            case 5 ->{
                for (String i : TotalAddressBook.keySet()) {
                    System.out.println(i);
                }
                if(TotalAddressBook.isEmpty()){
                    System.out.println("\nAddressBook List is Empty");
                }
                mainMenu();
            }
            case 6 ->{
                Uc8.SearchContact();
                mainMenu();
            }
            case 7 ->{
                Uc9.viewContact();
                mainMenu();
            }
            case 8 ->{
                Uc10.GetTotalcount();
                mainMenu();
            }
            case 9 ->{
                Uc12.sortByUserWish();
                mainMenu();
            }
            case 10 -> System.out.println("Thanking You");
            default -> System.out.println("Some thing Wrong");
        }
    }

    public static void main(String[] args) throws ParseException {

        mainMenu();
    }
}
