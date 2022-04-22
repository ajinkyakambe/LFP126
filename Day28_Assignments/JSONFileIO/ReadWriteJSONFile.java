/**
 * 
 * Ability to Read or Write the Address Book with Persons Contact as JSON File UC 15 - Use GSON Library
 *
 */
package com.ajinkyakambe.Addressbook.JSONFileIO;


import com.ajinkyakambe.Addressbook.Contacts;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.*;
import java.util.*;

public class ReadWriteJSONFile {
    
    String filepath = "C:\\Bridgelabs\\LFP126\\trial\\Day27_Assignments\\BridgeLabz_Java_AddressBook\\JSONFileIO\\AddressBook.json";

    public void readJSONFile() throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray;

        try {
            FileReader reader = new FileReader(filepath);
            jsonArray = (JSONArray) jsonParser.parse(reader);
            System.out.println(jsonArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeJSONFile(ArrayList<Contacts> contactsArrayList) {
        contactsArrayList.forEach(companyName -> {
            try {
                JSONArray jsonArray = new JSONArray();
                contactsArrayList.forEach(contacts -> {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("First name", contacts.getFirstName());
                    jsonObject.put("Last name", contacts.getLastName());
                    jsonObject.put("Address", contacts.getAddress());
                    jsonObject.put("City", contacts.getCity());
                    jsonObject.put("State", contacts.getState());
                    jsonObject.put("Zip", contacts.getZip());
                    jsonObject.put("Phone Number", contacts.getPhoneNumber());
                    jsonObject.put("Email", contacts.getEmail());

                    jsonArray.add(jsonObject);
                });
                FileWriter fw = new FileWriter(filepath);
                fw.write(jsonArray.toString());
                fw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
