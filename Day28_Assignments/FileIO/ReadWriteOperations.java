/**
 *
 * Ability to Read or Write the Address Book with Persons Contact into a File using File IO
 *
 *
 **/
package com.ajinkyakambe.Addressbook.FileIO;

import com.ajinkyakambe.Addressbook.Contacts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadWriteOperations {

    String filePath = "C:\\Bridgelabs\\LFP126\\trial\\Day27_Assignments\\BridgeLabz_Java_AddressBook\\FileIO\\AddressBook.txt";

    public void writeInAddressBook(ArrayList<Contacts> contactsArrayList) {
        StringBuffer empBuffer = new StringBuffer();
        contactsArrayList.forEach( (contacts) -> {
            String empDataString = (contacts.toString().concat("\n"));
            empBuffer.append(empDataString);
        });

        try {
            Files.write(Paths.get(filePath) , empBuffer.toString().getBytes());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromAddressBook() {
        try {
            Files.lines(new File(filePath).toPath())
                    .forEach(System.out::println);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
