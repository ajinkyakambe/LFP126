/**
 *
 * Ability to Read/Write the Address Book with Persons Contact as CSV File
 * - Use OpenCSV Library
 * 
 **/
package com.ajinkyakambe.Addressbook.CSVFileIO;

import com.ajinkyakambe.Addressbook.Contacts;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteCSVFile {
    String filePath = "C:\\Bridgelabs\\LFP126\\trial\\Day27_Assignments\\BridgeLabz_Java_AddressBook\\CSVFileIO\\AddressBook.csv";

    public void writeCSVFile(ArrayList<Contacts> contactsArrayList) {
        contactsArrayList.forEach(companyName -> {
            File file = new File(filePath);
            try {
                FileWriter outputfile = new FileWriter(file);
                CSVWriter writer = new CSVWriter(outputfile);

                //Add header to csv
                String[] header = { "FirstName", "LastName", "Address", "City", "State", "Zip", "PhoneNumber", "Email" };
                writer.writeNext(header);

                //Add data to csv
                contactsArrayList.forEach(contact -> {
                    String[] person1 = {contact.getFirstName(), contact.getLastName(), contact.getAddress(),
                            contact.getCity(), contact.getState(), String.valueOf(contact.getZip()),
                            String.valueOf(contact.getPhoneNumber()), contact.getEmail()};
                    writer.writeNext(person1);
                });

                //Close writer connection
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


    public void readCSVFile() {

        try {
            FileReader filereader = new FileReader(filePath);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            //Reading data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
